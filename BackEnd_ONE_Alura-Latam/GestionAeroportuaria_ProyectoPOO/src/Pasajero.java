

public class Pasajero {
	private String nombrePasajero;
	private int pasaporte;
	private String nacionalidad;
	
	
	public Pasajero() {
	}
	
	public Pasajero(String nombrePasajero, int pasaporte, String nacionalidad) {
		this.nombrePasajero = nombrePasajero;
		this.pasaporte = pasaporte;
		this.nacionalidad = nacionalidad;
		
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

	@Override
	public String toString() {
		return "Pasajero: " + nombrePasajero + ", \nNumero de pasaporte: " + pasaporte + ", \nNacionalidad: "
				+ nacionalidad + "\n";
	}
	
	
	
	
}
