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
		en.setVarenr(varenr);
		en.setNavn(navn);
		en.setPris(pris);
		
		if(en.getVarenr() != 0 || en.getNavn() != "null" && en.getPris() != 0) {
			b = true;
		}
		return b;
	}
	
	public Vare finnVare(int varenr) {
			
		throw new TODO("finnVare");

	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		throw new TODO("printVarelager");

	}
	
}
