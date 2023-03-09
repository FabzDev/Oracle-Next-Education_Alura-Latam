package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class Vuelo {
	int vueloID;
	String origin;
	String destino;
	double precio;
	int maxPasajeros;
	ArrayList<Pasajero> pasajeros;
	
	public Vuelo(int vueloID, String origin, String destino, double precio, int maxPasajeros, ArrayList<Pasajero> pasajeros) {
		this.vueloID = vueloID;
		this.origin = origin;
		this.destino = destino;
		this.precio = precio;
		this.maxPasajeros = maxPasajeros;
	}

	public int getVueloID() {
		return vueloID;
	}

	//insertarPasajero
	
	public String getOrigin() {
		return origin;
	}

	public String getDestino() {
		return destino;
	}

	public double getPrecio() {
		return precio;
	}

	public int showMaxPasajeros() {
		return maxPasajeros;
	}
	
	//numActualPasajeros
	
	// getPasajero(i)
	
	// getPasajero(String)
	
	
	
	
	
}
