package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class Vuelo {
	private String vueloID;
	private String origin;
	private String destino;
	private double precio;
	private int actPasajeros;
	private ArrayList <Pasajero> pasajeros;
	private int maxPasajeros = pasajeros.size();
	
	public Vuelo(String vueloID, String origin, String destino, double precio, int maxPasajeros) {
		this.vueloID = vueloID;
		this.origin = origin;
		this.destino = destino;
		this.precio = precio;
		this.maxPasajeros = maxPasajeros;
		this.actPasajeros = 0;
		this.pasajeros = new ArrayList<Pasajero>();
	}
	
	public Vuelo() {}

	
	public void insertarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
		System.out.println("Ingreso de pasajero exitoso");
	}
	
	public String getVueloID() {
		return vueloID;
	}
	
	public String getOrigin() {
		return origin;
	}

	public String getDestino() {
		return destino;
	}

	public double getPrecio() {
		return precio;
	}

	public int getActPasajeros() {
		return actPasajeros;
	}


	public void setActPasajeros(int actPasajeros) {
		this.actPasajeros = actPasajeros;
	}


	public int showMaxPasajeros() {
		return maxPasajeros;
	}
	
	public void getPasajero(int index) {
		pasajeros.get(index);
	}
	
	public Pasajero getPasajero(String nombrePasajero) {
		Pasajero encontrado = new Pasajero();
		for(Pasajero pasajero: pasajeros) {
			if(pasajero.getNombrePasajero() == nombrePasajero) {
				encontrado = pasajero; 
			}
		}
		return encontrado;
		
	}
	
	
	
	
}
