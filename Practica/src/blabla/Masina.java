package blabla;

public class Masina extends Autovehicul{

	private String culoare;
	private int nrLocuri;
	
	public String getCuloare() {
		return culoare;
	}
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	public int getNrLocuri() {
		return nrLocuri;
	}
	public void setNrLocuri(int nrLocuri) {
		this.nrLocuri = nrLocuri;
	}
	
	//nu ai voie sa restrangi accesul si nici tipul de returnare
	@Override
	public void afisare() {
		System.out.println("Masina");
		System.out.println(getMarca());
		System.out.println(getKm());
		System.out.println(culoare);
		System.out.println(nrLocuri);
		
	}
	
	
	
	
}
