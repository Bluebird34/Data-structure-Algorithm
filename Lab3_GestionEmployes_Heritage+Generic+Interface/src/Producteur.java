public class Producteur extends Employe{
    int nb_produit;
    double taux_uniaire = 0.1;

    public Producteur(String matricule, String nom, int echelon, int methodPaye, int nb_produit) {
        super(matricule, nom, echelon, methodPaye);
        this.nb_produit = nb_produit;
    }

    @Override
    double calculPrime() {
        return nb_produit * taux_uniaire;
    }
}
