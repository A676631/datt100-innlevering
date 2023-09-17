package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class OppgåveO2 {


		public static void main(String[] args) {
			for(int i =1; i<=10; i++) {
			String tallTxt = showInputDialog("poengsum");
			int poengsum = parseInt(tallTxt);
			
			
			if (poengsum <=39) 	
			System.out.println("karakter: F");
		
			else if (poengsum <=49) {
			System.out.println("karakter: E");
	}
			else if (poengsum <=59) {
				System.out.println ("karakter: D");		
	}
			else if (poengsum <=79) {
			System.out.println("karakter: C");
			
	}
			else if (poengsum <=89) {
			System.out.println("karakter: B");
			
		}
			else if (poengsum <=100) {
			System.out.println("karakter: A");
			
		} else {
				System.out.println("Error");
				i--;
		}
	}
	}
	}