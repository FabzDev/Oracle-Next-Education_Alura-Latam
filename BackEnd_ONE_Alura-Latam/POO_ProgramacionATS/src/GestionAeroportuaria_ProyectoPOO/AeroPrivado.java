package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class AeroPrivado extends Aeropuerto {

	public AeroPrivado(String nombre, String ciudad, String pais, double subvencion, ArrayList<Aerolinea> aerolineas) {
		super(nombre, ciudad, pais, pais, aerolineas);
	}

	
	public void showEmpresas(Empresa empresas[]) {
		for(Empresa empresa: empresas) {
			System.out.println(empresa.getNombreEmpresa());
		}
	}
}
