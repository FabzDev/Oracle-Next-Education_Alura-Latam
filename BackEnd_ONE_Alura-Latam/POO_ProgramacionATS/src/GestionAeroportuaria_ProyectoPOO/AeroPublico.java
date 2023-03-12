package GestionAeroportuaria_ProyectoPOO;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AeroPublico extends Aeropuerto {

	private BigDecimal subvencion;
	
	public AeroPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
		
	}
	
	
	public AeroPublico(String nombreAereopuerto, String ciudad, String pais, ArrayList<Aerolinea> aerolineas, BigDecimal subvencion) {
		super(nombreAereopuerto, ciudad, pais, aerolineas);
		this.subvencion = subvencion;
	}



	public AeroPublico(String nombre, String ciudad, String pais, BigDecimal subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion = subvencion;
	}

	public BigDecimal getSubvencion() {
		return subvencion;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + super.getNombreAereopuerto() +"\nCiudad: " + super.getCiudad() + "\nPaís: " + super.getPais() + "\nAerolineas: "
				+ super.aerolinesObjToStr(super.getAerolineas()) + "\nSubvención gubernamental: $" + this.getSubvencion();
	}

}
