package Ejercicio8BloquePOO;

public class Paquete {
	double numPaquete;
	double numCedula;
	double peso;
	String prioridad;
	
	public Paquete(double numPaquete, double numCedula, double peso, String prioridad) {
		this.numPaquete = numPaquete;
		this.numCedula = numCedula;
		this.peso = peso;
		this.prioridad = prioridad;
	}
	
	public double getNumPaquete() {
		return numPaquete;
	}
	
	public double getNumCedula() {
		return numCedula;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getPrioridad() {
		return prioridad;
	}
	
	public void mostrarDatosPaquete() {
		System.out.println("La informacion del paquete es: " +
							"\nNumero de paquete: " + getNumPaquete() +
							"\nNumero de cedula asociado: " + getNumCedula() +
							"\nPeso: " + getPeso() +
							"\nPrioridad: " + getPrioridad()
		);
	}
	
	
}
