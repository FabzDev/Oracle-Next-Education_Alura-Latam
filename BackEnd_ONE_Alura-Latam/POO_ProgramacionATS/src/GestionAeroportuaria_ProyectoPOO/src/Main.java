

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();

	public static void main(String[] args) {
		insertarDatosAeropuertos();
		desplegarMenu();
	}

	public static void insertarDatosAeropuertos() {
		aeropuertos.add(new AeroPublico("Rionegro", "Medellin", "Colombia", new BigDecimal(90_000_000)));
		aeropuertos.get(0).insertarAerolinea(new Aerolinea("Avianca"));
		aeropuertos.get(0).insertarAerolinea(new Aerolinea("Latam"));
		aeropuertos.get(0).getAerolinea("Avianca")
				.insertarVuelo(new Vuelo("AA2300", "Medellín", "Barranquilla", 160_000, 120));
		aeropuertos.get(0).getAerolinea("Avianca")
				.insertarVuelo(new Vuelo("AA2301", "Medellín", "Bogotá", 90_000, 120));
		aeropuertos.get(0).getAerolinea("Latam").insertarVuelo(new Vuelo("LM2310", "Medellín", "Cancun", 260_000, 150));
		aeropuertos.get(0).getAerolinea("Latam").insertarVuelo(new Vuelo("LM2311", "Medellín", "Lima", 190_000, 150));
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2300")
				.insertarPasajero(new Pasajero("Fabio Escobar", 114001, "Colombiano"));
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2300")
				.insertarPasajero(new Pasajero("Emilio Diaz", 114002, "Peruano"));
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2301")
				.insertarPasajero(new Pasajero("Julio Diaz", 114007, "Venezolano"));
		aeropuertos.get(0).getAerolinea("Avianca").getVuelo("AA2301")
				.insertarPasajero(new Pasajero("Ski Moto", 114003, "Canadiense"));
		aeropuertos.get(0).getAerolinea("Latam").getVuelo("LM2310")
				.insertarPasajero(new Pasajero("Malu Trevejo", 114008, "Cubana"));
		aeropuertos.get(0).getAerolinea("Latam").getVuelo("LM2310")
				.insertarPasajero(new Pasajero("John Dalien", 114004, "Americano"));
		aeropuertos.get(0).getAerolinea("Latam").getVuelo("LM2311")
				.insertarPasajero(new Pasajero("Roberto Hernandez", 114005, "Mexicano"));

		aeropuertos.add(new AeroPrivado("El Dorado", "Bogotá", "Colombia"));
		String[] empresas = { "Apple", "Alibaba", "Amazon" };
		((AeroPrivado) aeropuertos.get(1)).insertarEmpresas(empresas);
		aeropuertos.get(1).insertarAerolinea(new Aerolinea("Ultra"));
		aeropuertos.get(1).getAerolinea("Ultra")
				.insertarVuelo(new Vuelo("UA2320", "Bogotá", "Cartagena", 260_000, 110));
		aeropuertos.get(1).getAerolinea("Ultra").getVuelo("UA2320")
				.insertarPasajero(new Pasajero("Marcsla Vidalgo", 114910, "Argentiga"));

		aeropuertos.add(new AeroPublico("Ernesto Cortizos", "Barranquilla", "Colombia", new BigDecimal(60_000_000)));
		aeropuertos.get(2).insertarAerolinea(new Aerolinea("Wingo"));
		aeropuertos.get(2).insertarAerolinea(new Aerolinea("otraMas"));
		aeropuertos.get(2).getAerolinea("Wingo")
				.insertarVuelo(new Vuelo("WO2330", "Barranquilla", "Medellín", 160_000, 120));
		aeropuertos.get(2).getAerolinea("Wingo").insertarVuelo(new Vuelo("WO2331", "Medellín", "Bogotá", 90_000, 120));
		aeropuertos.get(2).getAerolinea("Wingo").getVuelo("WO2330")
				.insertarPasajero(new Pasajero("Yailin Hernandez", 114009, "Puertoriqueña"));
		aeropuertos.get(2).getAerolinea("Wingo").getVuelo("WO2330")
				.insertarPasajero(new Pasajero("Marcela Vidalgo", 114010, "Argentina"));

		aeropuertos.add(new AeroPublico("Rafael Nuñez", "Cartagena", "Colombia", new BigDecimal(150_000_000)));
		aeropuertos.get(3).insertarAerolinea(new Aerolinea("Viva Air"));
		aeropuertos.get(3).getAerolinea("Viva Air")
				.insertarVuelo(new Vuelo("VR2350", "Cartagena", "Cali", 180_000, 110));
		aeropuertos.get(3).getAerolinea("Viva Air")
				.insertarVuelo(new Vuelo("WO2351", "Cartagena", "Bucaramanga", 190_000, 110));
		aeropuertos.get(3).getAerolinea("Viva Air").getVuelo("VR2350")
				.insertarPasajero(new Pasajero("Paola Vergara", 114012, "Colombiana"));
	}

	public static Aeropuerto encontrarAero(String nombreBusqueda, ArrayList<Aeropuerto> listAeropuertos) {
		Aeropuerto encontrado = null;
		for (Aeropuerto aeropuerto : listAeropuertos) {
			if (nombreBusqueda.equals(aeropuerto.getNombreAereopuerto())) {
				encontrado = aeropuerto;
			}
		}
		if (encontrado == null) {
			System.out.println("El aeropuerto ingresado no existe");
		}
		return encontrado;
	}

	public static ArrayList<Vuelo> findArrayVuelos(String nombreAerolinea, ArrayList<Aeropuerto> aeropuertos) {
		ArrayList<Vuelo> encontrado = null;
		for (Aeropuerto aeropuerto : aeropuertos) {
			for (Aerolinea aerolinea : aeropuerto.getAerolineas()) {
				if (nombreAerolinea.equals(aerolinea.getNombreAerolinea()))
					encontrado = aerolinea.getVuelos();
			}
		}
		return encontrado;
	}

	public static String vuelosToString(ArrayList<Vuelo> vuelos) {
		ArrayList<String> vuelosList = new ArrayList<String>();
		for (Vuelo vuelo : vuelos) {
			vuelosList.add(vuelo.getVueloID());
		}
		String[] tempString = vuelosList.toArray(new String[0]);
		String tempString2 = String.join(", ", tempString);
		return tempString2;
	}

	public static ArrayList<Vuelo> encontrarVuelos(String orig, String dest, ArrayList<Aeropuerto> aeropuertos) {
		ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
		boolean encontrado = false;
		for (Aeropuerto aeropuerto : aeropuertos) {
			for (Aerolinea aerolinea : aeropuerto.getAerolineas()) {
				for (Vuelo vuelo : aerolinea.getVuelos()) {
					if (vuelo.getOrigin().equals(orig) && vuelo.getDestino().equals(dest)) {
						vuelosEncontrados.add(vuelo);
					}
				}
			}
		}
		if (!encontrado) {
			System.out.println("\nLo sentimos, en este momentos no tenemos vuelos disponibles para tu trayecto");
		}
		return vuelosEncontrados;
	}

	public static void desplegarMenu() {
		Scanner scan = new Scanner(System.in);

		int opcion;
		String nomBusAero;
		do {
			System.out.println("\n\t.:MENU:.");
			System.out.println("1. Consultar aeropuertos gestionados");
			System.out.println("2. Consultar empresas patrocinadoras o subvención gubernamental");
			System.out.println("3. Consultar aerolineas por aeropuerto");
			System.out.println("4. Consultar vuelos por aerolinea");
			System.out.println("5. Consultar trayecto");
			System.out.println("6. Salir");
			System.out.println("\nDigite la opción deseada:");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				// Consultar aeropuertos
				for (Aeropuerto aeropuerto : aeropuertos) {
					if (aeropuerto instanceof AeroPrivado) {
						System.out.println("\nAeropuerto Privado");
						System.out.println("Nombre: " + aeropuerto.getNombreAereopuerto());
						System.out.println("Ciudad: " + aeropuerto.getCiudad());
						System.out.println("País: " + aeropuerto.getPais());

					} else {
						System.out.println("\nAeropuerto Público");
						System.out.println("Nombre: " + aeropuerto.getNombreAereopuerto());
						System.out.println("Ciudad: " + aeropuerto.getCiudad());
						System.out.println("País: " + aeropuerto.getPais());

					}
				}
				break;

			case 2:
				// Consultar patrocinadores o subvención
				for (int i = 0; i < aeropuertos.size(); i++) {
					if (aeropuertos.get(i) instanceof AeroPrivado) {
						System.out.println("\nAereopuerto " + aeropuertos.get(i).getNombreAereopuerto());
						System.out.println(
								"Empresas patrocinadoras: " + ((AeroPrivado) aeropuertos.get(i)).getEmpresas());
					} else {
						System.out.println("\nAereopuerto " + aeropuertos.get(i).getNombreAereopuerto());
						System.out.println(
								"Subvención gubernamental: $" + ((AeroPublico) aeropuertos.get(i)).getSubvencion());
					}
				}
				break;

			case 3:
				// Consultar aerolineas por aeropuerto
				Aeropuerto tempAero;
				System.out.println("Digite el nombre del aeropuerto a consultar: ");
				String nombreAeropuerto = scan.next();
				nombreAeropuerto += scan.nextLine();
				tempAero = encontrarAero(nombreAeropuerto, aeropuertos);
				System.out.println(tempAero.aerolinesObjToStr(tempAero.getAerolineas()));
				break;

			case 4:
				// Consultar vuelos
				System.out.println("Ingrese la aerolinea a consultar: ");
				String nombreAerolinea = scan.next();
				ArrayList<Vuelo> vueloTemp = findArrayVuelos(nombreAerolinea, aeropuertos);
				System.out.println(vuelosToString(vueloTemp));
				break;

			case 5:
				// Consultar trayecto:
				System.out.println("\nIngrese la ciudad de origen: ");
				String origen = scan.next();

				System.out.println("\nIngrese la ciudad de destino: ");
				String destino = scan.next();

				ArrayList<Vuelo> vuelosEncontrados = encontrarVuelos(origen, destino, aeropuertos);
				for (Vuelo vuelo : vuelosEncontrados) {
					System.out.println("\nVuelos de " + origen + " a " + destino + ": ");
					System.out.println("Vuelo ID: " + vuelo.getVueloID() + ", origen: " + vuelo.getOrigin()
							+ ", destino: " + vuelo.getDestino() + ", precio: $" + vuelo.getPrecio());
				}

				break;

			case 6:
				System.out.println("\nHasta pronto");
				break;

			default:
				System.out.println("Opción incorrecta");

			}
		} while (opcion != 6);

	}
}
