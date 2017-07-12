package main;

import java.sql.SQLException;

import connect.MyConnection;
import modelsql.Vehicle;

public class MainClass {

	public static void main(String[] args){
		
		MyConnection connection = new MyConnection();
		//connection.connect();
		Vehicle myVehicle = new Vehicle();
		myVehicle = connection.getVehicleByBrand("Audi");
		System.out.println(myVehicle.getBrand()+"  "+ myVehicle.getColor()+"  "+myVehicle.getKm());
			
		
	}

}
