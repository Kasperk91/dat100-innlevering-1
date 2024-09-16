package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Innlevering03 {

	public static void main(String[] args) {
		int tall = parseInt( showInputDialog("Gi et tall:"));
		int fakultet = metode_fakultet(tall);
		
		
		System.out.println("Fakultet av " + tall + "! = " + fakultet);		
}

	
// lager en metode for fakultet: 

	public static int metode_fakultet(int f) {
		int resultat = 1;	
		
		for (int i = 1; i <= f; i++) {             // f = tallet som brukeren skriver inn, som man kan se på linje 10. 
			resultat *= i;                         // tallet starter på 1 og multipliseres med hvert tall opp til f. 
	}	return resultat;
	
	}
}
	
