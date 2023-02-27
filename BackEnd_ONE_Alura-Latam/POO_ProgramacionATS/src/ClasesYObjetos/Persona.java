package ClasesYObjetos;

public class Persona {
	//Atributos
	String nombre;
	int edad;
	String cc;
		
	//Método constructor
	public Persona(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
			
		}
	
	public Persona(String cc) {
		this.cc = cc;
		
	}
	
	
	//Métodos general
	public void correr() {
		System.out.println("Soy " + this.nombre + " y estoy corriendo una maraton");
		
	}
	
	public void correr(int km) {
		System.out.println("He corrido " + km + " kilometros");
		
	}
	
}

