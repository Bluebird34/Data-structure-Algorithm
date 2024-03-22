public class Ferroviaire extends Gestion_Livraison implements Taux_Tax_Ferroviaire{
    public Ferroviaire(String mode_Transport, double distance) {
        super(mode_Transport, distance);
    }

    //override tax() from parent class
    @Override
    public double tax() {
        return taux_Tax_Ferroviaire * super.baseTarif(super.distance);
    }
}
