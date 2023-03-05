package Ejercicio8BloquePOO;

public class Paquete {
	private int numPaquete;
	private int numCedula;
	private double peso;
	private int prioridad;

	public Paquete(int numPaquete, int numCedula, double peso, int prioridad) {
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

	public int getPrioridad() {
		return prioridad;

	}

	public String mostrarDatosPaquete() {
		return "\n\nNumero de paquete: " + getNumPaquete() 
		+ "\nNumero de cedula asociado: " + getNumCedula()
		+ "\nPeso: " + getPeso() 
		+ "\nPrioridad: " + getPrioridad();
	}

}
