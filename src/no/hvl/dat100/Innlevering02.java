package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Innlevering02 {

	public static void main(String[] args) {
		
		int antall_studenter = 1;
		
		for (int i=1; antall_studenter<=10; i++) {
			
			boolean gyldig_svar = false;
			int poengsum = 0;
			
			while (!gyldig_svar) {
				poengsum = parseInt( showInputDialog("Poengsum: "));
				
				if (poengsum < 0 || poengsum > 100) {
					showMessageDialog(null, "Ugyldig poengsum, tast inn en ny: "); 
	}
				
				else {
					gyldig_svar = true; 
	}
			
		
	}
		if (poengsum >= 90) {
			showMessageDialog (null, "Elev nummer: " + i + "\n" + "Du fikk karakteren:" + " A");
	}
		else if (poengsum >= 80) {
			showMessageDialog (null, "Elev nummer: " + i + "\n" + "Du fikk karakteren" + " B");
	}
		else if (poengsum >= 60) {
			showMessageDialog (null, "Elev nummer: " + i + "\n" + "Du fikk karakteren" + " C");
	}
		else if (poengsum >= 50) {
			showMessageDialog (null, "Elev nummer: " + i + "\n" + "Du fikk karakteren" + " D");
	}
		else if (poengsum >= 40) {
			showMessageDialog (null, "Elev nummer: " + i + "\n" + "Du fikk karakteren" + " E");
	}
		else if (poengsum >= 0) {
			showMessageDialog (null, "Elev nummer: " + i + "\n" + "Du fikk karakteren" + " F");
	}
		else {
			showMessageDialog (null, "Ugyldig poengsum");
	
	}
		antall_studenter ++;
	}
}	

	}

