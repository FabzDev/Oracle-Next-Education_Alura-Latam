package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class AeroPublico extends Aeropuerto {

	private double subvencion;
	
	public AeroPublico(String nombre, String ciudad, String pais, double subvencion, ArrayList<Aerolinea> aerolineas) {
		super(nombre, ciudad, pais, pais, aerolineas);
		this.subvencion = subvencion;
	}

}
