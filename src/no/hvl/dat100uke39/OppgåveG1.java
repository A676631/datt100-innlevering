package no.hvl.dat100uke39;
import static javax.swing.JOptionPane.showMessageDialog;


public class OppgåveG1 {
	public static void main(String[] args) {

    double[][] obs = {
	    				{1.4,1.7,1.9,2.0},
	    				{5.4,7.8,9.8,7.9,3.0},
	    				{-1.7,-1.7,-2.8}
	    	
	    		};
	
	    
	    int lengde0 = obs[0].length;
	    int lengde1 = obs[1].length;
	    int lengde2 = obs[2].length;
	    
	    double[] mid = obs[0];
	    obs[0]=obs[2];
	    obs[2]=mid;
	    
	    System.out.println (lengde0 + lengde1 + lengde2);
	    
	 //   skrivUt(obs);
	   skrivUt2(obs);
	    
	    
	    
	}

	    public static void skrivUt(double[][] tabell) {
	    for(int i = 0; i<tabell.length; i++) {
	    for(int j =0; j<tabell.length; j++)
	    
	    System.out.println(tabell[i][j]);
	    
	    
	    }
		

	
}
	  // TODO - legg til deklarasjon av metoder her

	    public static void skrivUt2(double[][] tabell2) {

	    
	    	for(double[] i:tabell2) {
	    	
	    	for(double j : i) {
	   System.out.println(j);
	    		
	    	}}
	    	
	    		
	    		
	    	}
	    	public static boolean finnes(double[][] obs, double limit) {
	    boolean finnes = false;
	    int i = 0;
	    int j = 0;
	    		while (!finnes && i < obs.length && j <obs[i].length) {
	    			if (obs[i][j] < limit )
	    				finnes = true;
	    			else
	    				i++;
	    		}
	    if (finnes) 
	    	showMessageDialog(null, "Funnet!");
	  return false;
	    	}
	    }
	    
