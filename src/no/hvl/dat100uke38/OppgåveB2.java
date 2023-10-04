package no.hvl.dat100uke38;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgåveB2 {

public class InputAreal {

	public static void main(String[] args) {


lesInnTall ("Skriv inn tall: ");
areal ("");



	}
	
	
	private static String areal(String Message) {
String Bredde = showInputDialog("Bredde: ");
String Hoyde = showInputDialog ("Hoyde: ");
int bredde = parseInt (Bredde);
int hoyde = parseInt (Hoyde);
		int flateareal = bredde * hoyde;
showMessageDialog(null,"Areal: "+ flateareal);
		return Message;
	}
	private static int lesInnTall(String message) {
		
		String tall = showInputDialog (message);
		int Tall = parseInt ( tall);
		showMessageDialog(null, "Heltall:" + tall );
		
		return Tall;
		
		
		
		
		
		
		
		
		
	}
} }
