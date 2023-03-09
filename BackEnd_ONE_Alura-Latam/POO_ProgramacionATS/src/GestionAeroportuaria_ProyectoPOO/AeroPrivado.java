package GestionAeroportuaria_ProyectoPOO;

import java.util.ArrayList;

public class AeroPrivado extends Aeropuerto {
	String [] empresas = new String[10];
	int numEmpresas;
	
	public AeroPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}
	
	public AeroPrivado(String nombre, String ciudad, String pais, ArrayList <Aerolinea> aerolineas, String [] empresas) {
		super(nombre, ciudad, pais);
		this.empresas = empresas;
		this.numEmpresas = empresas.length;
	}
	
	public void insertarEmpresas(String[] empresas) {
		this.empresas = empresas;
		this.numEmpresas = empresas.length;
	}
	
	public void insertarEmpresa(String empresa) {
		this.empresas[numEmpresas] = empresa;
		this.numEmpresas++;
	}

	public String[] getEmpresas() {
		return empresas;
	}
	
	public int getNumEmpresas() {
		return numEmpresas;
	}
	
	
	
	

	
}
