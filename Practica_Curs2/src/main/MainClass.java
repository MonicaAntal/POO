
package main;

import java.sql.SQLException;
import java.util.ArrayList;

import connect.MyConnection;
import modelsql.Vehicle;

public class MainClass {

	public static void main(String[] args) {
		MyConnection connection = new MyConnection();
		// connection.connect();
		
		Vehicle myVehicle = new Vehicle();
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		//cele doua randuri returneaza doar 3 intrari de la brandul Audi
		myVehicle = connection.getVehicleByBrand("Audi");
		System.out.println(myVehicle.getBrand() + "  " + myVehicle.getColor()+ "  " + myVehicle.getKm());
		
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

	}

}
