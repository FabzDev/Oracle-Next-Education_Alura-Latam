package Ejercicio3BloquePOO;

public class Carro {
	//atributos
	String marca;
	String modelo;
	double precio;
	
	//constructor
	public Carro(String marca, String modelo, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}

	//metodos
	public double getPrecio() {
		return this.precio;
	}
	
	public String mostrarDatos() {
		String mensaje = "\n\n\nEste es el carro mas economico: \nMarca: " + this.marca + "\nModelo: " 
							+ this.modelo + "\nPrecio: " + this.precio;  
		return mensaje;
	}
}
