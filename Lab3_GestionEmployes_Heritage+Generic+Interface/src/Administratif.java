public class Administratif extends Employe{
    int primeFixe = 500;
    public Administratif(String matricule, String nom, int echelon, int methodPaye) {
        super(matricule, nom, echelon, methodPaye);
    }

    @Override
    double calculPrime() {
        return primeFixe;
    }
}
