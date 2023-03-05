package Ejercicio8BloquePOO;

public class Paquete {
	private int numPaquete;
	private int numCedula;
	private double peso;
	private String prioridad;

	public Paquete(int numPaquete, int numCedula, double peso, String prioridad) {
		this.numPaquete = numPaquete;
		this.numCedula = numCedula;
		this.peso = peso;
		this.prioridad = prioridad;
	}

	public int getNumPaquete() {
		return numPaquete;
	}

	public int getNumCedula() {
		return numCedula;
	}

	public double getPeso() {
		return peso;
	}

	public String getPrioridad() {
		return prioridad;

	}

	public String mostrarDatosPaquete() {
		return "\n\nNumero de paquete: " + getNumPaquete() 
		+ "\nNumero de cedula asociado: " + getNumCedula()
		+ "\nPeso: " + getPeso() 
		+ "\nPrioridad: " + getPrioridad();
	}

}
