package GestionAeroportuaria_ProyectoPOO;

public class Aerolinea {
	private String nombreAerolinea;

	public Aerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}

	
	public void showVuelos(Vuelo vuelos[]) {
		for (Vuelo vuelo: vuelos) {
			System.out.println(vuelo.getVueloID());
		}
	}
	
	
	public String getNombreAerolinea() {
		return nombreAerolinea;
	}
	
}
