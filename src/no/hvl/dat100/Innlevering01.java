package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.*;


public class Innlevering01 {

	public static void main(String[] args) {
		
		int bruttolønn = parseInt( showInputDialog("Bruttolønn: "));

		
		// på det aktuelle trinnet: 
		
		double Trinn1 = (bruttolønn - 208051) * 0.017;
		double Trinn2 = (bruttolønn - 292851) * 0.04;
		double Trinn3 = (bruttolønn - 670001) * 0.136;
		double Trinn4 = (bruttolønn - 937901) * 0.166;
		double Trinn5 = (bruttolønn - 135001) * 0.176;
		
		

		// trinnskatten som skal betales i tillegg til det aktuelle trinnet 
		
	
		double Over_Trinn1 = (292850 - 208051) * 0.017;
		double Over_Trinn2 = (670000 - 292851) * 0.04;
		double Over_Trinn3 = (937900 - 670001) * 0.136;
		double Over_Trinn4 = (1350000 - 937901) * 0.166;
		
		
		if (bruttolønn > 1350000) {
			System.out.println("Du skal betale " +  ((int)Trinn5 + 
					Over_Trinn4 + (int)Over_Trinn3 + (int)Over_Trinn2 + (int)Over_Trinn1) +  ",- i trinnskatt"); }
		
		else if (bruttolønn < 1350000 && bruttolønn > 937900) {
			System.out.println("Du skal betale " + 
					((int)Trinn4 + (int)Over_Trinn1 + (int)Over_Trinn2 + (int)Over_Trinn3) + ",- i trinnskatt"); }
		
		else if (bruttolønn < 937900 && bruttolønn > 670000) {
			System.out.println("Du skal betale " + 
					((int)Trinn3 + (int)Over_Trinn1 + (int)Over_Trinn2) + ",- i trinnskatt"); }
		
		else if (bruttolønn < 670000 && bruttolønn > 292850) {
				System.out.println("Du skal betale " + 
						((int)Trinn2 + (int)Over_Trinn1) + ",- i trinnskatt"); }
		
		else if (bruttolønn < 292850 && bruttolønn > 208050) {
			System.out.println("Du skal betale " + 
					(int)Trinn1 + ",- i trinnskatt"); }
		
		else if (bruttolønn < 208050) {
			System.out.println("Du skal ikke betale trinnskatt");	}
		
		else {
			System.out.println("ugyldig");
		}
		
// skriver int før utskrift for å unngå mange desimaler i svaret.
		
	}


	}

