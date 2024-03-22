/**
 Author: Han Yan
 Pondation: 15%
 */
package demarrage;
import expressionsInfixes.ConvertisseurInfixeEnSuffixe;
import expressionsInfixes.EvaluateurSuffixe;

public class TestProgramme {
	public static void main(String[] args) {

		//Initialize arith expression infixe
		String arithExp_infixe = "(6*2-4)/8-4";

		//Create obj of two classes
		ConvertisseurInfixeEnSuffixe convertisseur = new ConvertisseurInfixeEnSuffixe();
		EvaluateurSuffixe evaluateur = new EvaluateurSuffixe();

		//Convert infixe to suffixe
		String arithExp_suffixe = convertisseur.convertirEnSuffixe(arithExp_infixe);
		System.out.println("The infixe expression is : " +arithExp_infixe);
		System.out.println("The suffixe expression is : " +arithExp_suffixe);

		//Evaluate the result of suffixe
		Double valeur_suffixe = evaluateur.evaluerSuffixe(arithExp_suffixe);
		System.out.println("The value of suffixe expression is : " + valeur_suffixe);
	}
}
