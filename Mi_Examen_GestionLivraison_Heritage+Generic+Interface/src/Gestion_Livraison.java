public abstract class Gestion_Livraison implements Grille_Tarifaire,Taux_Tax {
    String mode_Transport;
    double distance;

    //constructor
    public Gestion_Livraison(String mode_Transport,double distance) {
        this.mode_Transport = mode_Transport;
        this.distance = distance;
    }

    //calculer le frais total, tax() now from interface Taux_Tax
    public double calculFrais(double distance){
        return baseTarif(distance) + tax();
    }

    //implements interface Grille_Tarifaire's function baseTarif(distance)
    @Override
    public double baseTarif(double distance) {
        if (0 <= distance & distance <= 100){
            return grille_1;
        } else if (101 <= distance & distance <= 500) {
            return grille_2;
        } else if (501 <= distance & distance <= 1000) {
            return grille_3;
        } else {
            System.out.println("C'est pas appliquer");
            return 0;
        }
    }

    //to String
    @Override
    public String toString() {
        return "Gestion_Livraison{" +
                "mode_Transport='" + mode_Transport + '\'' +
                ", distance=" + distance +
                ", FraisTotal=" + calculFrais(distance) +
                '}';
    }
}
