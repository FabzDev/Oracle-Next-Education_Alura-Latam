package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void createPasajeros() {
		// Arrays:
		ArrayList<Pasajero> pasajeros= new ArrayList<>();
		pasajeros.add(new Pasajero("Fabio Escobar", 114001, "Colombiano")); //0
		pasajeros.add(new Pasajero("Emilio Diaz", 114002, "Peruano")); //1
		pasajeros.add(new Pasajero("Ski Moto", 114003, "Canadiense")); //2
		pasajeros.add(new Pasajero("John Dalien", 114004, "Americano")); //3 
		pasajeros.add(new Pasajero("Roberto Hernandez", 114005, "Mexicano")); //4
		pasajeros.add(new Pasajero("Felipe Noriega", 114006, "Colombiano")); //5
		pasajeros.add(new Pasajero("Julio Diaz", 114007, "Venezolano")); //6
		pasajeros.add(new Pasajero("Malu Trevejo", 114008, "Cubana")); //7
		pasajeros.add(new Pasajero("Yailin Hernandez", 114009, "Puertoriqueña")); //8
		pasajeros.add(new Pasajero("Marcela Vidalgo", 114010, "Argentina")); //9
		pasajeros.add(new Pasajero("Angie Mesa", 114011, "Chilena")); //10
		pasajeros.add(new Pasajero("Paola Vergara", 114012, "Colombiana")); //11
		
		for(Pasajero pasajero: pasajeros) {
			System.out.println(pasajero.toString());
			}
		}	
	
	
	public static void main(String[] args) {
		// Scanner:
		Scanner ent = new Scanner(System.in);
		// Variables:
		int opcion;
		do {
			createPasajeros();
			System.out.println("\n\t.:MENU:.");
			System.out.println("1. Consultar Aeropuertos");
			System.out.println("2. Consultar empresas patrocinadoras (aeropuerto privado)");
			System.out.println("3. Consultar subvención gubernamental (aeropuerto público)");
			System.out.println("4. Consultar aerolineas por aeropuerto");
			System.out.println("5. Consultar vuelos por aerolinea y aeropuerto");
			System.out.println("6. Consultar trayecto");
			System.out.println("7. Salir");
			System.out.println("\nDigite la opción deseada:");
			opcion = ent.nextInt();
			
			
			switch (opcion) {

			case 1:
				// Consultar aeropuertos
				break;

			case 2:
				// Consultar patrocinadores
				break;

			case 3:
				// Consultar subvencion
				break;

			case 4:
				// Consultar aerolineas
				break;

			case 5:
				// Consultar vuelos
				break;

			case 6:
				// Consultar trayecto
				break;

			case 7:
				break;

			}
		} while (opcion != 7);

	}
}

