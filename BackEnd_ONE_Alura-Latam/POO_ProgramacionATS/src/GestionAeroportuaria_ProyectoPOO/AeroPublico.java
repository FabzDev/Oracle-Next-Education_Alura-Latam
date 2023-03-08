package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class AeroPublico extends Aeropuerto {

	private double suvencion;
	
	public AeroPublico(String nombre, String ciudad, String pais, ArrayList<Aerolinea> aerolineas, double suvencion) {
		super(nombre, ciudad, pais, aerolineas);
		this.suvencion = suvencion;
	}

}
