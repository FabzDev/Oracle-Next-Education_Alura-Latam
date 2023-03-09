package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class AeroPublico extends Aeropuerto {

	private double subvencion;
	
	public AeroPublico(String nombre, String ciudad, String pais, ArrayList<Aerolinea> aerolineas, double subvencion) {
		super(nombre, ciudad, pais, aerolineas);
		this.subvencion = subvencion;
	}

}
