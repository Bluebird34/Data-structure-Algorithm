/**
 * Lab 3 (10%)
 * Author : Han Yan
 */


import java.util.ArrayList;

/**
 * This version I add MethodePaye interface with an abstract method getMethodPaye(int methodPaye),
 * add an abstract method getBaseSalaire(int echelon) in interface BaseSalaire.
 */

public class Main {
    public static void main(String[] args) {

        //Creat child class obj using parent Employe reference(Poly)
        Employe employe1 = new Gestionnaire("E1101","Benoit",1, 2,3600);
        Employe employe2 = new Professionnel("E1102","Alice",3,8);
        Employe employe3 = new Administratif("E1103","Lee",5, 3);
        Employe employe4 = new Producteur("E1104","Simard",8, 1,800);


        ArrayList<Employe> employeArrayList = new ArrayList<Employe>();

        //Add the employe obj to the arraylist
        employeArrayList.add(employe1);
        employeArrayList.add(employe2);
        employeArrayList.add(employe3);
        employeArrayList.add(employe4);

        //For-each
        for (Employe i : employeArrayList) {
            System.out.println(i.toString());
        }
    }
}