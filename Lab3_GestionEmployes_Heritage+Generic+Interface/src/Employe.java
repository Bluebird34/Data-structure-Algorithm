public abstract class Employe implements BaseSalaire,MethodePaye {
    String matricule;
    String nom;
    int echelon;
    int methodPaye;
    public Employe(String matricule,String nom,int echelon, int methodPaye) {
        this.matricule = matricule;
        this.nom = nom;
        this.echelon = echelon;
        this.methodPaye = methodPaye;
    }

    //Calculer le salaire total (include two sub function, one is abstract)
    public double calculTotal(int echelon){
        return getBaseSalaire(echelon) + calculPrime();
    }

    //Calculer le prime
    abstract double calculPrime();

    //Get le base salaire
    @Override
    public double getBaseSalaire(int echelon) {
        switch (echelon) {
            case 1:
                return baseSalaire_1;
            case 2:
                return baseSalaire_2;
            case 3:
                return baseSalaire_3;
            case 4:
                return baseSalaire_4;
            case 5:
                return baseSalaire_5;
            case 6:
                return baseSalaire_6;
            default:
                System.out.println("L'echelon does not exist!Pas de info de base salaire");
                return 0;
        }
    }

    //Get le methode de paye
    @Override
    public String getMethodPaye(int methodPaye) {
        switch (methodPaye) {
            case 1:
                return methodPaye_1;
            case 2:
                return methodPaye_2;
            case 3:
                return methodPaye_3;
            default:
                System.out.println("cette methode exist pas!");
                return null;
        }
    }
    //To string
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", echelon=level " + echelon +
                ", salaireFinal=" + calculTotal(echelon) +
                ", Method de Paye= " + getMethodPaye(methodPaye) +
                '}';
    }
}
