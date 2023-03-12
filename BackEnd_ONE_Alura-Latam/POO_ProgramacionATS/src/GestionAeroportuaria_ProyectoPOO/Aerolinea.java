package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class Aerolinea {
	private String nombreAerolinea;
	private ArrayList <Vuelo> vuelos = new ArrayList<>(); 
	private int cantVuelos = vuelos.size();
	
	public Aerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}
	
	public Aerolinea(String nombreAerolinea, Vuelo vuelos) {
		this.nombreAerolinea = nombreAerolinea;
		this.vuelos.add(vuelos);
		
	}
	
	public Aerolinea() {}

	public void insertarVuelo(Vuelo vuelo) {
		vuelos.add(vuelo);
	}
		
	public String getNombreAerolinea() {
		return nombreAerolinea;
	}
	
	public ArrayList <Vuelo> getVuelos() {
		return vuelos;
	}
	
	public Vuelo getVueloIndex(int indexVuelo) {
		return vuelos.get(indexVuelo);
	}
	
	public Vuelo getVuelo(String idVuelo) {
		Vuelo encontrado = new Vuelo();
		for(Vuelo vuelo:vuelos) {
			if(vuelo.getVueloID() == idVuelo) {
				encontrado = vuelo;
			}
		}
		return encontrado;
	}
	
	
	
}
