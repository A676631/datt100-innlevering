package no.hvl.dat100.uke40;

public class OppgåveO1B {
	// a)
		public static void skrivUt(int[][] matrise) {
			
				for (int i = 0; i < matrise.length; i++) {
					for (int j = 0; j < matrise[i].length; j++) {
						System.out.print(matrise[i][j] );
					}
					System.out.println();
		}
	}

		// b)
		public static String tilStreng(int[][] matrise) {

			StringBuilder streng = new StringBuilder();
			for (int x= 0; x < matrise.length; x++) {
				for (int y = 0; y < matrise[x].length; y++) {
					streng.append(matrise[x][y]).append(" ");
					
				}streng.append("\n");
			}return streng.toString();
			
		}

		// c)
		public static int[][] skaler(int tall, int[][] matrise) {
			int antallRad = matrise.length;
			int antallKol = matrise[0].length;
			int [][] newMatrix = new int [antallRad][antallKol];
			for (int z = 0; z < matrise.length; z++) {
				for (int w = 0; w < matrise[z].length; w++) {
					newMatrix[z][w] = matrise[z][w]*tall;
				}
			}return(newMatrix);
		
		}

		// d)
		public static boolean erLik(int[][] a, int[][] b) {

	int linje1, søyle1, linje2, søyle2;
			
			boolean equals = true;
			
			linje1 = a.length;
			søyle1 = a[0].length;

			linje2 = b.length;
			søyle2 = b[0].length;

			// lage en kode som skal skjekke om størrelsen i de to forskjellige
			// matrisene er like.
			if (søyle1 != søyle2 || linje1 != linje2) {
				System.out.println("Matrisene  ikke like! ");}
			else {
				for (int e = 0; e < linje1; e++) {
					for (int r = 0; r < søyle1; r++) {
						if (a[e][r] != b[e][r]) {
							equals = false;
							break;
						}
					}
				}
				if(equals) 
					System.out.println("Matrisene er like");
				
				 else System.out.println("Matrisene er ikke like ");
					
			}
		return(equals);
		}
		
		// e)
		public static int[][] speile(int[][] matrise) {

			// TODO
			throw new UnsupportedOperationException("Metoden speile ikke implementert");
		
		}

		// f)
		public static int[][] multipliser(int[][] a, int[][] b) {

			// TODO
			throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
		
		}
	}

