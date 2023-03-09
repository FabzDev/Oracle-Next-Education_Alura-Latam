package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombreAereopuerto;
	private String ciudad;
	private String pais;
	private String tipo;

	private ArrayList<Aerolinea> aerolineas = new ArrayList<Aerolinea>();

	public Aeropuerto(String nombre, String ciudad, String pais, String tipo, ArrayList<Aerolinea> aerolineas) {
		this.nombreAereopuerto = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.aerolineas = aerolineas;
	}

	public void insertarAerolinea(Aerolinea aerolinea) {
		aerolineas.add(aerolinea);
	}

	public void showAerolineas(Aerolinea aerolines[]) {
		for (Aerolinea aeroline : aerolines) {
			System.out.println(aeroline.getNombreAerolinea());
		}

	}

	public int getCantAerolineas() {
		return aerolineas.size();
	};

	public Aerolinea getAerolinea(int index) {
		return aerolineas.get(index);
	}

	public Aerolinea getAerolinea(String nombre) {
		Aerolinea encontrado = new Aerolinea();
		for(Aerolinea aerolinea:aerolineas) {
			if(aerolinea.getNombreAerolinea() == nombre) {
				encontrado = aerolinea;
			}
		}
		return encontrado;
		

	}
	

}
