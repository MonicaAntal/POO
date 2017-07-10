package bla;

public class MainClass {

	public static void main(String[] args) {
		
		Masina car1 = new Masina();
		
		car1.setMarca("BMW");
		car1.setKm(-1000);
		car1.setCuloare("Blue");
		car1.setNrLocuri(3);
		
		System.out.println(car1.getMarca());
		System.out.println(car1.getKm());
		System.out.println(car1.getCuloare());
		System.out.println(car1.getNrLocuri());
		
		
		Masina car2 = new Masina("Audi", 1000, "red", 4);
		car2.setKm(2000); //se suprascrie
		System.out.println(car2.getMarca());
		System.out.println(car2.getKm());
		System.out.println(car2.getCuloare());
		System.out.println(car2.getNrLocuri());
		
		Camion truck = new Camion("Iveco", 4000, 35, 5);
		System.out.println(truck.getMarca());
		System.out.println(truck.getKm());
		System.out.println(truck.getTone());
		System.out.println(truck.getNrOsii());
		
	
	}
}
