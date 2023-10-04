package no.hvl.dat100uke39;

public class OppgåveB1 {
	public static void main(String[] args) {

		boolean[][] audp;

		int ANTALL = 4;
		int RADER = 4;
		int REKKER = ANTALL*RADER;
		boolean[][] d117 = new boolean[RADER][ANTALL];

		boolean[][] aud = 
			{ 
			  { false, false, false, false}, // rad 0
			  { false, false, true,  false}, // rad 1
			  { true,  false, true,  true }, // rad 2
			  { true,  true,  true,  true }, // rad 3
		};
double antallTommeRader = 0;
	for (int r = 0; r < aud.length; r++) {
		boolean[] rad = aud[r];
		for (int p = 0; p < rad.length; p++) {	
		boolean plass = rad[p];
		if (!plass) {
			antallTommeRader++;
			
		}
		}
	}
	boolean finnet = false;
	int radIndex = -1;
	int plassIndex = -1;
	for (int r=0; r<aud[0].length; r++) {
		boolean[] rad = aud[r];
	for (int p = 0; p<rad.length; p++ ) {
		if (!rad[p]) {
			radIndex = r;
			plassIndex= p;
			finnet = true;
			break;
		}
	}
	if (finnet) {
		break;
	}
	}
		
			
		System.out.println("første ledige plass e på rad  " + radIndex + "rekke "+ plassIndex);
	}
		public static boolean skrivUt(boolean[][]tabell) {
		boolean finst = false;
		int RadIndex = -1;
		int PlassIndex = -1;
	for(int r=0; r< tabell.length; r++) {
		boolean[] rad =tabell[r];
		for(int p=0; p<tabell.length; r++) {
			if(!rad[p]) {
				RadIndex=r;
				PlassIndex=p;
				return true;
				break;
			}
		}
		return false;
		if(PlassIndex !=-1)	{
		break;
		}
	System.out.println("Ledig plass funnet på rad: "+ RadIndex+ ", plass" + PlassIndex);
	
	}
	
	
			
		
System.out.println("Antall ledige plasser er: "+ antallTommeRader);

		double LedigePlasser = (antallTommeRader/REKKER)*100;
		System.out.println ("Prosenten av ledige seter er: "+ LedigePlasser+ "%");
		// avlese en verdi
		boolean plass12 = aud[1][2];
		System.out.println(plass12);

		boolean plass21 = aud[2][1];
		System.out.println(plass21);

		// sette en verdi
		System.out.println(aud[0][1]);
		aud[0][1] = true;
		System.out.println(aud[0][1]);

		// ta ut en rad
		boolean[] rad0 = aud[2];

		// skrive ut en rad
		for (int p = 0; p < rad0.length; p++) {

			boolean plass = rad0[p];
			
			if (plass) {
				System.out.print("X");
			} else {
				System.out.print("O");
			}
		}
		
		System.out.println();

		System.out.println("version 1");

		for (int r = 0; r < aud.length; r++) {

			boolean[] rad = aud[r];

			for (int p = 0; p < rad.length; p++) {

				boolean plass = rad[p];

				if (plass) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
				System.out.println();
			
			}
		
		int R = 0;
		boolean funnet = false;
		
		while (R < aud.length && !funnet) {
			
			int p = 0;
			while (p<aud[r].length && !funnet) {
				
				if (!(aud[r][p])) {
					funnet = true;
				}
				
				p++;
			}
			
			R++;
		}

		System.out.println(funnet);
	}

	}}