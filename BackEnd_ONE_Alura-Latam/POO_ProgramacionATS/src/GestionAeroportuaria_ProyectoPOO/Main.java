package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner ent = new Scanner(System.in);
	static ArrayList <Aeropuerto> aeropuertos = new ArrayList<>();
	
	public static void main(String[] args) {
	
	}
	
	public static void insertarDatosAeropuertos() {
		aeropuertos.add(new AeroPublico("Rionegro", "Medellin", "Colombia", 90_000_000));
		aeropuertos.get(0).insertarAerolinea(new Aerolinea("Avianca"));
		aeropuertos.get(0).insertarAerolinea(new Aerolinea("Latam"));
		aeropuertos.get(0).getAerolinea("Avianca").insertarVuelo(new Vuelo("AA2300", "Medellín", "Barranquilla", 160_000, 120));
		aeropuertos.get(0).getAerolinea("Avianca").insertarVuelo(new Vuelo("AA2301", "Medellín", "Bogotá", 90_000, 120));
		aeropuertos.get(0).getAerolinea("Latam").insertarVuelo(new Vuelo("LM2310", "Medellín", "Cancun", 260_000, 150));
		aeropuertos.get(0).getAerolinea("Latam").insertarVuelo(new Vuelo("LM2311", "Medellín", "Lima", 190_000, 150));
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2300").insertarPasajero(new Pasajero("Fabio Escobar", 114001, "Colombiano"));
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2300").insertarPasajero(new Pasajero("Emilio Diaz", 114002, "Peruano")); 
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2301").insertarPasajero(new Pasajero("Julio Diaz", 114007, "Venezolano"));
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2301").insertarPasajero(new Pasajero("Ski Moto", 114003, "Canadiense")); 
		aeropuertos.get(0).getAerolinea("Latam").getVuelo("LM2310").insertarPasajero(new Pasajero("Malu Trevejo", 114008, "Cubana"));
		aeropuertos.get(0).getAerolinea("Latam").getVuelo("LM2310").insertarPasajero(new Pasajero("John Dalien", 114004, "Americano")); 
		aeropuertos.get(0).getAerolinea("Latam").getVuelo("LM2311").insertarPasajero(new Pasajero("Roberto Hernandez", 114005, "Mexicano"));
		
		aeropuertos.add(new AeroPrivado("El Dorado", "Bogotá", "Colombia"));
		String [] empresas = {"Apple", "Alibaba", "Amazon"};
		((AeroPrivado) aeropuertos.get(1)).insertarEmpresas(empresas);
		aeropuertos.get(1).getAerolinea("Ultra").insertarVuelo(new Vuelo("UA2320", "Bogotá", "Cartagena", 260_000, 110));
		aeropuertos.get(1).getAerolinea("Ultra").getVuelo("UA2320").insertarPasajero(new Pasajero("Felipe Noriega", 114006, "Colombiano"));
		
		
		aeropuertos.add(new AeroPublico("Ernesto Cortizos", "Barranquilla", "Colombia", 60_000_000));
		aeropuertos.get(2).insertarAerolinea(new Aerolinea("Wingo"));
		aeropuertos.get(2).insertarAerolinea(new Aerolinea("otraMas"));
		aeropuertos.get(2).getAerolinea("Wingo").insertarVuelo(new Vuelo("WO2330", "Medellín", "Barranquilla", 160_000, 120));
		aeropuertos.get(2).getAerolinea("Wingo").insertarVuelo(new Vuelo("WO2331", "Medellín", "Bogotá", 90_000, 120));
		aeropuertos.get(2).getAerolinea("Wingo").getVuelo("WO2330").insertarPasajero(new Pasajero("Yailin Hernandez", 114009, "Puertoriqueña"));
		aeropuertos.get(2).getAerolinea("Wingo").getVuelo("WO2330").insertarPasajero(new Pasajero("Marcela Vidalgo", 114010, "Argentina")); 
		
		aeropuertos.add(new AeroPublico("Rafael Nuñez", "Cartagena", "Colombia", 150_000_000));
		aeropuertos.get(2).insertarAerolinea(new Aerolinea("Viva Air"));
		aeropuertos.get(2).getAerolinea("Viva Air").insertarVuelo(new Vuelo("VR2350", "Cartagena", "Cali", 180_000, 110));
		aeropuertos.get(2).getAerolinea("Viva Air").insertarVuelo(new Vuelo("WO2351", "Cartagena", "Bucaramanga", 190_000, 110));
		aeropuertos.get(2).getAerolinea("Viva Air").getVuelo("VR2350").insertarPasajero(new Pasajero("Paola Vergara", 114012, "Colombiana"));
	}
}
