package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class AeroPublico extends Aeropuerto {

	private double subvencion;
	
	public AeroPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
		
	}
	
	
	
	public AeroPublico(String nombreAereopuerto, String ciudad, String pais, ArrayList<Aerolinea> aerolineas, double subvencion) {
		super(nombreAereopuerto, ciudad, pais, aerolineas);
		this.subvencion = subvencion;
	}



	public AeroPublico(String nombre, String ciudad, String pais, double subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion = subvencion;
	}




	public double getSubvencion() {
		return subvencion;
	}
	
	

}
