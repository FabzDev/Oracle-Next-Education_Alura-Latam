package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class Aerolinea {
	private String nombreAerolinea;
	private ArrayList <Vuelo> vuelos = new ArrayList<>(); 
	private String idVuelo;	
	
	public Aerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}

	
	public Aerolinea(String nombreAerolinea, int idVuelo) {
		this.nombreAerolinea = nombreAerolinea;
		this.idVuelo = idVuelo;
	}

	//insertarVuelo
		
	public String getNombreAerolinea() {
		return nombreAerolinea;
	}
	
	//getNumerodeVuelos
	
	public int getNumVuelo(int indexVuelo) {
		//TO DO
	}
	
	public int getNumVuelo(String idVuelo) {
		//TO DO
	}
	
	
	
}
