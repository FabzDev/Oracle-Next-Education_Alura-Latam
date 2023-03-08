package GestionAeroportuaria_ProyectoPOO;

public class Vuelo {
	int vueloID;
	String origin;
	String destino;
	double precio;
	int maxPasajeros;
	
	public Vuelo(int vueloID, String origin, String destino, double precio, int maxPasajeros) {
		this.vueloID = vueloID;
		this.origin = origin;
		this.destino = destino;
		this.precio = precio;
		this.maxPasajeros = maxPasajeros;
	}

	public int getVueloID() {
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

	public int showMaxPasajeros() {
		return maxPasajeros;
	}
	
	
	
	
	
}
