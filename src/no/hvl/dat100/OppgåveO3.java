package no.hvl.dat100;
import javax.swing.JOptionPane;
public class OppgåveO3 {
	

		public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Skriv et positivt heltall");
		
		int n = Integer.parseInt(input);
		if (n <1) {
			JOptionPane.showMessageDialog(null, "skriv et positivt heltall");
		}
		else {
			int verdien = calculateFactorial(n);
			JOptionPane.showMessageDialog(null,n+"!="+verdien);
		}
		}
		private static int calculateFactorial(int n) {
			if (n==0 || n==1) {
				return 1;
				
			}else {
			return n * calculateFactorial (n-1);
			
		}	
	}
	}


