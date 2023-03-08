package GestionAeroportuaria_ProyectoPOO;

public class Pasajero {
	private String nombrePasajero;
	private int pasaporte;
	private String nacionalidad;
	private Vuelo vuelo;
	
	public Pasajero(String nombrePasajero, int pasaporte, String nacionalidad, Vuelo vuelo) {
		this.nombrePasajero = nombrePasajero;
		this.pasaporte = pasaporte;
		this.nacionalidad = nacionalidad;
		this.vuelo = vuelo;
		
	}
	
	public String getNombrePasajero() {
		return nombrePasajero;
	}
	
	public int getPasaporte() {
		return pasaporte;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	
	
	
}
