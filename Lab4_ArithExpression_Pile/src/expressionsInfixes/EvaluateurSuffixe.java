package expressionsInfixes;
import pileGenerique.Pile;
public class EvaluateurSuffixe {

    //Function to evaluate the suffixe expression
    public static double evaluerSuffixe(String arithExp_suffixe){
        double valeur = 0;
        Pile<Double> pile_Operand = new Pile<Double>();
        for (int i = 0; i < arithExp_suffixe.length(); i++) {
            char element = arithExp_suffixe.charAt(i);
            if(Character.isDigit(element)) {
                pile_Operand.empiler((double) Character.getNumericValue(element));
            } else if (Character.toString(element).matches("[+-/*]")) {
                double operande1 = pile_Operand.depiler();
                double operande2 = pile_Operand.depiler();
                valeur = resultat(operande1,element,operande2);
                pile_Operand.empiler(valeur);
            }
        }
        return valeur;
    }
    //Function to Caculate
    public static double resultat(double n1,char op, double n2){
        switch(op) {
            case '+':
                return n2 + n1;
            case '-':
                return n2 - n1;
            case '*':
                return n2 * n1;
            case '/':
                return n2 / n1;
            default:
                System.out.println("Oprateur format n'est pas valide");
                return 0;
        }
    }

}
