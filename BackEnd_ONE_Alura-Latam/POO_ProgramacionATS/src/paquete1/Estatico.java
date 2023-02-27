package paquete1;

public class Estatico {
	private static String frase = "Primera frase";
	
	public static void main(String[] args) {
	Estatico ob1 = new Estatico();
	Estatico ob2 = new Estatico();
	
	ob2.frase = "Segunda frase";

	System.out.println(Estatico.frase);
	System.out.println(ob2.frase);
	
	}
}
