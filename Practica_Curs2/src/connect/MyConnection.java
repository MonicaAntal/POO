package connect;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import modelsql.Vehicle;

public class MyConnection {

	private static final String HOST = "jdbc:mysql://localhost:3306";
	private static final String DBNAME = "unitbv";
	private static final String DBUSER = "root";
	private static final String DBPASS = "root";
	private static final String DBURL = HOST + "/" + DBNAME + "?autoReconnect=true&useSSL=false";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	private static Connection conn=null;
	private static Statement stmt = null;
	private static ResultSet result = null;
	
	
	private String brand = " ";
	private int id;
	
	
	public MyConnection(){
		
	}
	//metoda care face conexiunea cu DB
	public static void connect(){
		System.out.println("Driver not initialized yet");
		try {
			Class.forName(JDBC_DRIVER);
			
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			stmt = conn.createStatement();
			System.out.println("All is good");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("Driver initialized");
	}
	
	public Vehicle getVehicleByBrand(String brand){
		this.brand = brand;
		Vehicle audi = new Vehicle();
		String sqlStatement = "select * from unitbv.vehicle where brand = '"+brand+"';";
		connect();
		try {
			
			result = stmt.executeQuery(sqlStatement); //returneaza obiectul in DB
			System.out.println("Statement executed corectly!");
			
			while(result.next()){
				audi.setBrand(result.getString("brand")); //numele coloanei din tabel
				audi.setColor(result.getString("color"));
				audi.setHp(result.getInt("hp"));
				audi.setKm(result.getInt("km"));
				audi.setProddate(result.getDate("proddate"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			flush(result, stmt, conn); 
		}
		return audi;
	}

	//inchide conexiunea cu baza de date
	private void flush(ResultSet resultSet, Statement statement, Connection conn) {
		try{
			if(resultSet != null)
				resultSet.close();
			else  if(statement != null){
				statement.close();
			}
			else if(conn != null){
				conn.close();
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
}
	//exemplu cu ArrayList
	public ArrayList<Vehicle> getVehicles(){
		String sqlStatement = "select * from unitbv.vehicle";
		ArrayList<Vehicle> audiList = new ArrayList<Vehicle>();
		Vehicle vehicle = null;
		connect();
		try {
			result = stmt.executeQuery(sqlStatement);
			System.out.println("Statement executed corectly!!");
			
			while(result.next()){
				vehicle = new Vehicle();
				vehicle.setBrand(result.getString("brand"));
				vehicle.setColor(result.getString("color"));
				vehicle.setHp(result.getInt("km"));
				vehicle.setKm(result.getInt("km"));
				vehicle.setProddate(result.getDate("proddate"));
				audiList.add(vehicle);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			flush(result, stmt, conn);
		}
		return audiList;
	}
	
	private void closeConnection(Statement stmt, Connection conn){
		try{
			if(stmt != null)
				stmt.close();
			else  if(conn != null){
				conn.close();
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	//metoda de stergere masina
	public Vehicle deleteCar(int idVehicle){
		String query = "DELETE FROM unitbv.vehicle WHERE id='"+idVehicle+"';";
		connect();
		try{
			stmt.executeUpdate(query);
			System.out.println("The car with id "+idVehicle+" is deleted!");
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			closeConnection(stmt,conn);
		}
		return null;
	}
	//metoda de adaugare masina
	public Vehicle addCar(String brand, int hp, String proddate, int km, String color){
		String sqlAdd = "INSERT INTO unitbv.vehicle (brand, hp, proddate, km, color) VALUES ('"+brand+"', "+hp+", '"+proddate+"', "+km+", '"+color+"')";
		Vehicle vehicle = null;
		try {
			stmt = conn.createStatement();
			
			stmt.executeUpdate(sqlAdd);
			System.out.println("A new row was added!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			closeConnection(stmt, conn);
			System.out.println("Connection closed.");
		}
		return vehicle;
	}
	
	//modifica date din tabel
	public Vehicle updateCar(int id, String brand, int km, String color){
		String sqlUpdate = "UPDATE unitbv.vehicle set brand= '"+brand+"', km= '"+km+"', color= '"+color+"' WHERE id= '"+id+"';";
		Vehicle vehicle = null;
		
		try {
			stmt = conn.createStatement();
			
			stmt.executeUpdate(sqlUpdate);
			System.out.println("Row no. "+id+" was updated.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			closeConnection(stmt, conn);
		}
		return vehicle;
	}
	
}
