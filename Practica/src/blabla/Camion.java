package blabla;

public class Camion extends Autovehicul{

	private int tone;
	private int nrOsii;
	
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
	@Override
	public void afisare() {
		System.out.println("Camion");
		System.out.println(getMarca());
		System.out.println(getKm());
		System.out.println(tone);
		System.out.println(nrOsii);
	}

	
	
}
