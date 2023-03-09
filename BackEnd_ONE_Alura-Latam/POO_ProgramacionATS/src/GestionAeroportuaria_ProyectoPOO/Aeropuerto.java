package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombreAereopuerto;
	private String ciudad;
	private String pais;
	private String tipo;
	
	private ArrayList <Aerolinea> aerolineas = new ArrayList<Aerolinea>();
	
	
	public Aeropuerto(String nombre, String ciudad, String pais, String tipo,ArrayList<Aerolinea> aerolineas) {
		this.nombreAereopuerto = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.aerolineas = aerolineas;
	}
	
	//insertaraerolinea
	
	public void showAerolineas(Aerolinea aerolines[]) {
		for(Aerolinea aeroline: aerolines) {
			System.out.println(aeroline.getNombreAerolinea());
		}
		
	}
	
	//obteneraerolineas
	
	//getcantidadAerolineas
	
	//obteneraerolinea (index)
	
	//obteneraerolinea (nombre)
	
}
