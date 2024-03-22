public class Gestionnaire extends Employe implements TauxPrimeGestionnaire{
    double chiffre_affaire;

    public Gestionnaire(String matricule, String nom, int echelon, int methodPaye, double chiffre_affaire) {
        super(matricule, nom, echelon, methodPaye);
        this.chiffre_affaire = chiffre_affaire;
    }

    @Override
    double calculPrime() {
        return tauxPrime_Gestionnaire * chiffre_affaire;
    }
    @Override
    public double getBaseSalaire(int echelon) {
        return 0;
    }
}
