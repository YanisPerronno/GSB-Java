package gsb.tests;

import gsb.modele.Localite;
import gsb.modele.Visiteur;

public class LocaliteTest {
	public static void main (String[] args) {
		Localite uneLocalite = new Localite ("56700","Hennebont");
		System.out.println("code postal : "+uneLocalite.getCodePostal());
		System.out.println("ville: "+uneLocalite.getVille());
	}
}
