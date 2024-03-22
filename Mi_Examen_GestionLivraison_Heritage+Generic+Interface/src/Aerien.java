public class Aerien extends Gestion_Livraison implements Taux_Tax_Aerien{
    public Aerien(String mode_Transport, double distance) {
        super(mode_Transport, distance);
    }

    //override tax() from parent class
    @Override
    public double tax() {
        return taux_Tax_Aerien * super.baseTarif(super.distance);
    }
}
