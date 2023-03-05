package Ejercicio8BloquePOO;

public class Sucursal {
	private int numSucursal;
	private String direccion;
	private String ciudad;

	public Sucursal(int numSucursal, String direccion, String ciudad) {
		this.numSucursal = numSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public int getNumSucursal() {
		return numSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void mostrarDatosSucursal() {
		System.out.println("La informacion de la sucursal es: " 
				+ "\nNumero de sucursal: " + getNumSucursal()
				+ "\nDireccion: " + getDireccion() 
				+ "\nCiudad: " + getCiudad());
	}

	public String calcularPrecio(Paquete paq) {
		double precio;
		switch (paq.getPrioridad()) {

		case "Estandar":
			precio = paq.getPeso();
			break;

		case "Alta":
			precio = paq.getPeso() + 10;
			break;

		case "Express":
			precio = paq.getPeso() + 20;
			break;

		default:
			precio = 0;
			System.out.println("Opción inválida");
		}
		return "Precio de envío: $" + precio;
	}

}
