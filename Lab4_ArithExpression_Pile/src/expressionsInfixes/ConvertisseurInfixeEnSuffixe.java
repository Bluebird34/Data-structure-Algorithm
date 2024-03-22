package expressionsInfixes;
import pileGenerique.Pile;
public class ConvertisseurInfixeEnSuffixe {
    public ConvertisseurInfixeEnSuffixe(){};

    //Function to convert infixe to suffixe
    public static String convertirEnSuffixe(String arithExp_infixe){
        String arithExp_suffixe = " " ;
        Pile myPile = new Pile<>();
        myPile.empiler('(');
        arithExp_infixe = arithExp_infixe + ')';
     //   System.out.println("infixe now :" + arithExp_infixe);

        for (int i = 0; i < arithExp_infixe.length(); i++) {
            char element = arithExp_infixe.charAt(i);

            if(Character.isDigit(element)) {
                arithExp_suffixe = arithExp_suffixe + element;
           //     System.out.println("if is chiffre, suffixe now :" + arithExp_suffixe);

            } else if (element == '(' ){
                myPile.empiler(element);
           //     System.out.println("if is '(' parenthese :" + myPile);

            } else if (Character.toString(element).matches("[+-/*]")) {
                if(estUnOperateur((Character) myPile.voir()) && prioriteEgaleOuGrande(element, (Character) myPile.voir())){
                    arithExp_suffixe = arithExp_suffixe + myPile.voir();
                    myPile.depiler();
                    myPile.empiler(element);
               //     System.out.println("if sommet_element > courant_element :" + myPile + arithExp_suffixe);
                }else{
                    myPile.empiler(element);
               //     System.out.println("if not sommet>courant  :" + myPile);
                }

            } else if (element == ')' ) {
                while(!((Character) myPile.voir() == '(')){
                    arithExp_suffixe = arithExp_suffixe + (Character) myPile.voir();
                    myPile.depiler();
                //    System.out.println("if is ')' parenthese :" + myPile + arithExp_suffixe);
                }
                myPile.depiler();
            }
        }
        return arithExp_suffixe;
    }
    //Function to aecide if the element of pile is operator or not
    public static boolean estUnOperateur(char element){
        boolean flag = false;
        if(Character.toString(element).matches("[+-/*]")) {
            flag = true;
        }
        return flag;
    }

    //Function to decide the priority of two operators.
    public static boolean prioriteEgaleOuGrande(char operateur1, char operateur2){
        boolean flag = false;
        int prority_operateur1 = 0;
        int prority_operateur2 = 0;
        if(operateur1 == '+' || operateur1 == '-') {
            prority_operateur1 = 1;
        }
        if (operateur1 == '*' || operateur1 == '/'){ //will have problem to use else-if
            prority_operateur1 = 2;
        }
        if (operateur2 == '+' || operateur2 == '-') {
            prority_operateur2 = 1;
        }
        if (operateur2 == '*' || operateur2 == '/'){
            prority_operateur2 = 2;
        } else{
            System.out.println("l'operateur n'est pas valide!");
        }
     //   System.out.println("l'operateur courant est: " + prority_operateur1);
     //   System.out.println("l'operateur sommet est: " + prority_operateur2);
        if(prority_operateur1 <= prority_operateur2) {
            flag = true;
        } else{
            flag = false;
        }
        return flag;
    }
}
