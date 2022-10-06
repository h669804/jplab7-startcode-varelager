package no.hvl.dat100.varelager;

public class NutofTheWeek {

	public static void main(String[]args) {
		int[][] toDim = { {1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		skrivUt(toDim);
		
	}
	public static void skrivUt(int[][] tabell) {
		int h1 = 0;
		int h2 = 0;
		while(h1 < tabell.length) {
			if(h2 < tabell[h1].length) {
				System.out.print(+ tabell[h1][h2] + " ");
				h2++;
			}else {
				System.out.println();
				h1++;
				h2 = 0;
			}
			
		}
	}
}
