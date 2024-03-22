public class Professionnel extends Employe implements TauxPrimeProfessionnel{
    public Professionnel(String matricule, String nom, int echelon, int methodPaye) {
        super(matricule, nom, echelon, methodPaye);
    }

    @Override
    double calculPrime() {
        return tauxPrime_Professionnel * super.getBaseSalaire(super.echelon);
    }
}
