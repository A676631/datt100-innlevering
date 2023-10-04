package no.hvl.dat100uke38;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgåveG1 {

	public static void main(String[] args) {
		String helTall = showInputDialog ("skriv et heltall: ");
		int tall = Integer.parseInt(helTall);
		
		
	
		
		int [] tabell = {1,3,4,7,9,10};
		tabell[2]=7;
		int helTall2 = tabell[2];
	System.out.println (helTall2); 
		
	skrivUt(tabell);
		finnes(tabell,tall);
		skiftFortegn(tabell);
		skrivUt(tabell);
		
		
	} 
		public static void skrivUt(int[] tab) {
			System.out.print ("[");
			for (int i=0; i<tab.length; i++) {
			System.out.print (tab[i] + " ");
			} 
				System.out.print ("]"); 
			
				String [] helTab = {"[", "1",  "3",  "4",  "7",  "9",  "10", "]"};
				for ( String Heltall : helTab)
				System.out.print(Heltall);
		}
				public static void finnes(int[] tabell, int tall) {
					int a = 0;
					boolean random = false;
					while (a< tabell.length) {
						if (tall == tabell[a]) {
							random = true ;
							break ;
						} else {
							a++;
						}
				
				}
					System.out.println("\n"+ "Er talet i tabell?" + "\n" +"svar: "+ random);
						}

				public static int[] skiftFortegn (int[] tabell) {
					int b=0 ;
					while (b< tabell.length) {
						tabell[b]=tabell[b]*-1;
						b++;
						
					}
				return tabell;
				
				
}	
				}
			

