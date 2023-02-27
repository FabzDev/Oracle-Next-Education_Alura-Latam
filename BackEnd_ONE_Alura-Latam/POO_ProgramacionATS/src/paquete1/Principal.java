package paquete1;

public class Principal {
	public static void main(String[] args) {
		Persona fabio = new Persona("Fabio Escobar", 30);
		
		fabio.setEdad(33);
		fabio.mostrarDatos();
	}
}
