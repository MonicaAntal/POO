package main;

import java.sql.SQLException;
import java.util.ArrayList;

import connect.MyConnection;
import modelsql.Vehicle;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		MyConnection connection = new MyConnection();
		// connection.connect();
		
		Vehicle myVehicle = new Vehicle();
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		//cele doua randuri returneaza doar 3 intrari de la brandul Audi
		myVehicle = connection.getVehicleByBrand("Audi");
		System.out.println(myVehicle.getBrand() + "  " + myVehicle.getColor()+ "  " + myVehicle.getKm());
		
		System.out.println("\n");
		vehicles = connection.getVehicles();
		System.out.println(vehicles.get(0).getBrand()+" "+vehicles.get(0).getColor()+" "+vehicles.get(0).getKm());
		System.out.println(vehicles.get(1).getBrand()+" "+vehicles.get(1).getColor()+" "+vehicles.get(1).getKm());
		
		//cod nou pt a itera peste lista de masini
		for (int i = 0; i < vehicles.size(); i++) {
			System.out.println("###########################");
			System.out.println(vehicles.get(i).getIdVehicle());
			System.out.println(vehicles.get(i).getBrand());
			System.out.println(vehicles.get(i).getHp());
			System.out.println(vehicles.get(i).getProddate());
			System.out.println(vehicles.get(i).getKm());
			System.out.println(vehicles.get(i).getColor());
			
		}
		
		//sterge masina din tabel
		Vehicle del = new Vehicle();
		del=connection.deleteCar(8);
		del=connection.deleteCar(9);
		
		
		//adauga masina in tabel
		Vehicle logan = new Vehicle();
		//logan = connection.addCar("Logan", 101, "2014-08-04", 800, "yellow"); 
		//rand comentat pt a nu se executa de mai multe ori
		
		//modificare masina in tabel
		logan = connection.updateCar(6, "Logan", 220, "green");
		
	}
}
