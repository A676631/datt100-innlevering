package no.hvl.dat100;
import javax.swing.JOptionPane;

public class OppgåveO1 {

		public static void main(String[] args) {
			String inntekt = JOptionPane.showInputDialog("Skriv inn brutto årslønn ,");
			double Skatt = 0;
			double Trinnskatt = 0;
		
			int Inntekt = Integer.parseInt(inntekt);
			if (Inntekt <= 198349) {
				 Skatt = 0;
				Trinnskatt = Inntekt*Skatt;
			}
				else if (Inntekt <= 2791490) {
				
				Skatt= 0.017;
				Trinnskatt = Inntekt * Skatt;
				}
				else if (Inntekt <= 642949) {
					 Skatt = 0.04;
					 Trinnskatt = Inntekt * Skatt ;
				}
				else if (Inntekt <= 926799) {
					 Skatt = 0.135;
					 Trinnskatt = Inntekt * Skatt ;
					
				}
				else if (Inntekt <= 1499999) {
					 Skatt = 0.165;
							 Trinnskatt = Inntekt * Skatt ;
					
				}
				else if (Inntekt >= 1500000) {
					 Skatt = 0.175 ;
							 Trinnskatt = Inntekt * Skatt ;
				}
				
					
					System.out.print("Trinn skatt: "+ Trinnskatt + "kr");

}}
