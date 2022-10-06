package no.hvl.dat100.varelager;

public class Vare {

	private int vareNr = 10;
	private String vareNavn = "Potet";
	private double pris = 5.42;
	
	public Vare(int varenr, String navn, double pris) {
		this.vareNr = varenr;
		this.vareNavn = navn;
		this.pris = pris;
		
	}
	
	public int getVarenr() {
		return vareNr;
		
	}
	
	public void setVarenr(int varenr) {
		this.vareNr = varenr;
	}
	
	public String getNavn() {
		
		return vareNavn;
	}
	
	public void setNavn(String navn) {
		
		this.vareNavn = navn;
	}
	
	public double getPris() {
		
		return pris;
	}
	
	public void setPris(double pris) {
		
		this.pris = pris;
	}
	
	public double beregnMoms() {
		
		pris *= 0.2;
		return pris;
	}
	
	public String toString() {
		
		return "Vare [" + "varenr=" + vareNr + ", " + "navn=" + vareNavn + ", " + "pris=" + pris + "]";
	}
	
	public boolean erBilligereEnn(Vare v) {
		boolean b = false;
		if( pris < v.getPris()) {
			b = true;
		}
		return b;
	}
	
}
