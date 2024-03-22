public class Routier extends Gestion_Livraison implements Taux_Tax_Routier {
    public Routier(String mode_Transport, double distance) {
        super(mode_Transport, distance);
    }

    //override tax() from parent class
    @Override
    public double tax() {
        return taux_Tax_Routier;
    }
}
