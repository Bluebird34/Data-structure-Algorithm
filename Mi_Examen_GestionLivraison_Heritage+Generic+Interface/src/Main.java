/**
 * Mi-Session : pondation 25%
 * Author : Han Yan
 */
/**
 * This improved version ---the 4 specific interfaces heritate a general tax taux.
 * Attention -- the constans putting into one interface are supposed to apply to all the sub-classes.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //creat child obj using parent reference (poly)
        Gestion_Livraison livraison1 = new Aerien("Aérien",425);
        Gestion_Livraison livraison2 = new Maritime("Maritime",620);
        Gestion_Livraison livraison3 = new Ferroviaire("Ferroviaire",820);
        Gestion_Livraison livraison4 = new Routier("Routier",80);

        ArrayList<Gestion_Livraison> livraisonsArrayList = new ArrayList();

        livraisonsArrayList.add(livraison1);
        livraisonsArrayList.add(livraison2);
        livraisonsArrayList.add(livraison3);
        livraisonsArrayList.add(livraison4);

        //for each
        for (Gestion_Livraison i : livraisonsArrayList) {
            System.out.println(i);
        }
    }
}