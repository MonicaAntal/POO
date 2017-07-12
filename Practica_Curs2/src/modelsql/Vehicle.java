package modelsql;

import java.sql.Date;

public class Vehicle {

	
	public Vehicle(){
		
	}
	private int id;
	private String brand;
	private int hp;
	private Date proddate;
	private int km;
	private String color;
	
	public int getIdVehicle() {
		return id;
	}
	public void setIdVehicle(int idVehicle) {
		this.id = idVehicle;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public Date getProddate() {
		return proddate;
	}
	public void setProddate(Date proddate) {
		this.proddate = proddate;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}
