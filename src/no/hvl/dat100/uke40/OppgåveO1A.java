package no.hvl.dat100.uke40;

public class OppgåveO1A {
/*	public static void main(String[] args) {
		int[]tabell= {1,2,3,4,5};
		skrivUt(tabell);
		int[]Tabell= {42,67,89};
		String resultat = tilStreng(Tabell);
		System.out.println(resultat);
		
		int sum1 =summerFor(tabell);
		System.out.println("Sum ved bruk av for-løkke er: "+ sum1);
		int sum2 = summerWhile(tabell);
		System.out.println ("Sum ved bruk av while-løkke er: " +sum2);
		int sum3 =summerUFor(tabell);
		System.out.println("Sum ved bruk av utvidet for-løkke er: "+ sum3);

	int tall = 3; //tall for boolean d)
	boolean Resultat = finnesTall(tabell, tall);
	
	if (Resultat) {
		System.out.println(tall+ " finnes i tabellen");
	} else {
		System.out.println(tall+ " finnes ikkje i tabellen");
	}
		int tall2=4;
		int posisjon = posisjonTall(tabell, tall2);
		
		if (posisjon !=-1) {
			System.out.println(tall2 + " finnes på indeks " + posisjon + " i tabellen");
		}else {
			System.out.println ("-1");
		}
	int[]rTabell=reverser(tabell);
	System.out.print("reversert tabell er: ");
	reverser(rTabell);
	skrivUt(rTabell);

	boolean erSortert = erSortert(tabell);
	System.out.println("Er tabellen sortert i stigende rekkefølge? "+ erSortert);
	
	int[]tabell1= {2,4,6,8,10};
	int[]tabell2= {1,3,5,7,9};
	int[]nyTabell= settSammen(tabell1,tabell2);
	System.out.print("Ny tabell er: ");
	System.out.print("[");
	skrivUtTabell(nyTabell);
	System.out.print("]");
	}
	
	*/
	
	public static void skrivUt (int[] tabell) {
				for(int i = 0; i<tabell.length; i++) {
					System.out.print("[");
					System.out.print(tabell[i]+ "");
					System.out.print("]");
				}
				System.out.println();
				
			}		
	public static String tilStreng (int[] tabell) {

	if(tabell.length==0) {
		return "[]";
	}
	StringBuilder streng = new StringBuilder("[");
	for(int i =0; i< tabell.length; i++) {
		streng.append(tabell[i]);
		if( i< tabell.length -1) {
		streng.append (", ");
				
	}
	}
		streng.append("]");
		
		return streng.toString();

}
	public static int summerFor (int[] tabell) {
	int sum = 0;
	for(int i = 0; i< tabell.length; i++) {
		sum += tabell[i];
	}
	return sum;
}
	public static int summerWhile (int[]tabell) {
		int sum = 0;
			int i = 0;
		while ( i< tabell.length) {
			sum += tabell[i];
			i++;
			
	}
		return sum;
		
}
	public static int summerUFor (int[]tabell) {
		int sum=0;
		for(int tall : tabell) {
			sum +=tall;
			}
		return sum;
	}
	public static boolean finnesTall(int[]tabell, int tall) {
		
		for(int i=0; i< tabell.length; i++) {
			if(tabell[i]==tall) {
				return true;
			}
		}
		return false;
	}
	public static int posisjonTall(int[]tabell, int tall) {
		
		for(int i=0; i< tabell.length; i++) {
			if(tabell[i]==tall) {
				return i;
			}
		}
		return -1;
	}
	public static int [] reverser(int[] tabell) {
		int lengde = tabell.length;
		int[]rTabell= new int[lengde];
		for(int i = 0; i <tabell.length; i++) {
			rTabell[i]=tabell[lengde-1-i];
			
		}
		return rTabell;
		}
	public static boolean erSortert (int[] tabell) {
		for (int i =1; i< tabell.length; i++) {
		if (tabell[i] < tabell[i-1]) {
			return false;
		}
		}
		return true;
		
		
	}
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		int[] nyTabell = new int[lengde1+ lengde2];
		for (int i = 0; i <lengde1; i++) {
			nyTabell[i]=tabell1[i];
		}
		for (int i = 0; i <lengde1; i++) {
			nyTabell[lengde1+ 1]= tabell2[i];
		}
	
		return nyTabell;
			
			
			
		}
	public static void skrivUtTabell(int[]tabell) {
		for( int i = 0; i< tabell.length; i++) {
			
			System.out.print(tabell[i] + " ");
			
		}
		
	}

}
