package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	//konstruktør
	public Varelager(int n) {
		varer = new Vare[n];
		antall = 0;
	}
	
	public Vare[] getVarer() {
		return varer;
	}
	
	public boolean leggTilVare(Vare v) {
		boolean b = false;
		
		if(antall < varer.length) {
			varer[antall] = v;
			antall++;
			b = true;
			}
		return b;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		boolean b = false;
		Vare en = new Vare(varenr, navn, pris);
		
		if(antall < varer.length) {
			varer[antall] = en;
			antall++;
			b = true;
		}
		return b;
	}
	
	public Vare finnVare(int varenr) {
		Vare v1 = null;
		for(int i = 0; i < varer.length; i++) {
			if(varenr == i) {
				v1 = varer[i];
			}
		}
		return v1;
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
		
		System.out.println(SEP);
		for(int i = 0; i < varer.length; i++) {
			varer[i].toString();
		}
	}
	
}
