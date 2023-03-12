package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombreAereopuerto;
	private String ciudad;
	private String pais;
	private ArrayList<Aerolinea> aerolineas = new ArrayList<Aerolinea>();

	public Aeropuerto(String nombre, String ciudad, String pais) {
		this.nombreAereopuerto = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
	}

	public Aeropuerto(String nombreAereopuerto, String ciudad, String pais, ArrayList<Aerolinea> aerolineas) {
		super();
		this.nombreAereopuerto = nombreAereopuerto;
		this.ciudad = ciudad;
		this.pais = pais;
		this.aerolineas = aerolineas;
	}

	public Aeropuerto() {
		// TODO Auto-generated constructor stub
	}

	public void insertarAerolinea(Aerolinea aerolinea) {
		aerolineas.add(aerolinea);
	}

	public String getNombreAereopuerto() {
		return nombreAereopuerto;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public ArrayList<Aerolinea> getAerolineas() {
		return aerolineas;
	}

	public Aerolinea getAerolinea(int index) {
		return aerolineas.get(index);
	}

	public Aerolinea getAerolinea(String nombre) {
		Aerolinea encontrado = new Aerolinea();
		for (Aerolinea aerolinea : aerolineas) {
			if (aerolinea.getNombreAerolinea() == nombre) {
				encontrado = aerolinea;
			}
		}
		return encontrado;
	}

	
	public String aerolinesObjToStr(ArrayList <Aerolinea> aerolines) {
		ArrayList <String> aerolineList = new ArrayList<String>();
		for(Aerolinea aeroline: aerolines) {
			aerolineList.add(aeroline.getNombreAerolinea());
		}
		String[] tempString = aerolineList.toArray(new String[0]);
		String tempString2 = String.join(", ", tempString);
		return tempString2;
	}
//PENDING!
}
