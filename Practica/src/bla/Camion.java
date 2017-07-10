package bla;

public class Camion {

	private String marca;
	private int km;
	private int tone;
	private int nrOsii;
	
	public Camion(String marca, int km, int tone, int nrOsii){
		this.marca = marca; 
		this.km = km;
		this.tone = tone;
		this.nrOsii = nrOsii;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getTone() {
		return tone;
	}

	public void setTone(int tone) {
		this.tone = tone;
	}

	public int getNrOsii() {
		return nrOsii;
	}

	public void setNrOsii(int nrOsii) {
		this.nrOsii = nrOsii;
	}
	
	
}
 