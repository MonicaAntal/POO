package bla;

public class Masina {

	private String marca;
	private int km;
	private String culoare;
	private int nrLocuri;
	
	public Masina(){
		
	}
	
	public Masina(String marca, int km, String culoare, int nrLocuri){
		this.marca=marca;
		if(km<0){
			System.err.println("Km < 0 !"); //mesaj de eroare
		}else{
			this.km = km;
		}
		this.km=km;
		this.culoare=culoare;
		this.nrLocuri=nrLocuri;
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
		if(km<0){
			System.err.println("Km < 0 !"); //mesaj de eroare
		}else{
			this.km = km;
		}
		
	}
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
	
	
	
	
}
