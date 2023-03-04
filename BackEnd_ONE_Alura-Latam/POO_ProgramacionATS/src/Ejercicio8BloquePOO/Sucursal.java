package Ejercicio8BloquePOO;

public class Sucursal {
	int numSucursal;
	String direccion;
	String ciudad;
	
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
		System.out.println("La informacion de la sucursal es: " +
							"\nNumero de sucursal: " + getNumSucursal() +
							"\nDireccion: " + getDireccion() +
							"\nCiudad: " + getCiudad()
		);
	}
	
	
	
	
	
	
	
}
