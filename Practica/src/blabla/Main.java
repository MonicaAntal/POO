package blabla;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Masina car1 = new Masina();

		car1.setMarca("BMW");
		car1.setKm(1000);
		car1.setCuloare("Blue");
		car1.setNrLocuri(5);
		
		Masina car2 = new Masina();
		car2.setMarca("Audi");
		car2.setKm(2000);
		car2.setCuloare("Red");
		car2.setNrLocuri(5);
		
		Masina car3 = new Masina();
		car3.setMarca("Logan");
		car3.setKm(1250);
		car3.setCuloare("Yellow");
		car3.setNrLocuri(5);
		
		ArrayList<Masina> listaMasini = new ArrayList<Masina>();
		listaMasini.add(car1);
		listaMasini.add(car2);
		listaMasini.add(car3);
		
		for (int i = 0; i < listaMasini.size(); i++) {
			//System.out.println(listaMasini.get(i).getMarca()); //returneaza doar marca masinii
			//System.out.println(listaMasini.get(i).getKm()); sau...
			System.out.println("-----");
			listaMasini.get(i).afisare(); // afiseaza toti parametrii masinii, declarati in metoda de afisare
 		}
		
		
	/*	
		Camion truck = new Camion();
		
		truck.setMarca("Iveco");
		truck.setKm(2500);
		truck.setTone(35);
		truck.setNrOsii(3);
		
		//car1.afisare();
		//truck.afisare();
		
		//exemplu de ArrayList
		ArrayList<String> listaStudenti = new ArrayList<String>();
		listaStudenti.add("George");
		listaStudenti.add("Ana");
		listaStudenti.add("Vlad");
		
		for (int i = 0; i < listaStudenti.size(); i++) {
			System.out.println(listaStudenti.get(i));
		}
		*/
		
	}

}  
