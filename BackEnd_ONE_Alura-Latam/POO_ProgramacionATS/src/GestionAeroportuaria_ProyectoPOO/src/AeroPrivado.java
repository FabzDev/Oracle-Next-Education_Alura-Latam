

import java.util.ArrayList;

public class AeroPrivado extends Aeropuerto {
	String[] empresas = new String[10];
	int numEmpresas;

	public AeroPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}

	public AeroPrivado(String nombreAereopuerto, String ciudad, String pais, ArrayList<Aerolinea> aerolineas,
			String[] empresas, int numEmpresas) {
		super(nombreAereopuerto, ciudad, pais, aerolineas);
		this.empresas = empresas;
		this.numEmpresas = numEmpresas;
	}

	public void insertarEmpresas(String[] empresas) {
		this.empresas = empresas;
		this.numEmpresas = empresas.length;
	}

	public void insertarEmpresa(String empresa) {
		this.empresas[numEmpresas] = empresa;
		this.numEmpresas++;
	}

	public String getEmpresas() {
		return String.join(", ", empresas);
	}

	public int getNumEmpresas() {
		return numEmpresas;
	}

	
	@Override
	public String toString() {
		return "\nNombre: " + super.getNombreAereopuerto() +"\nCiudad: " + super.getCiudad() + "\nPaís: " + super.getPais() + "\nAerolineas: "
				+ super.aerolinesObjToStr(super.getAerolineas()) + "\nEmpresas patrocinadoras: " + this.getEmpresas();
	}
	
}
