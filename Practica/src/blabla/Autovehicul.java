package blabla;
//

public abstract class Autovehicul {


	private String marca;
	private int km;
	
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
	
	public abstract void afisare();
	
}
