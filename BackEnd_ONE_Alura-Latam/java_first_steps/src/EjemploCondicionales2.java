
public class EjemploCondicionales2 {
	public static void main(String[] args) {
			
		int edad = 14;
		int cantidad = 1;
		
		
		if (edad >= 18) {
			System.out.println("Entra!");
		} else {
			if (cantidad >= 2) {
			System.out.println("Usted es menor de edad, pero esta permitido su ingreso porque viene con alguien");}
			else 
			System.out.println("Lo siento, para ingresar, debes ser mayor de edad o venir acompañado");
			
			
			double salario = 2300.0;

	        if(salario < 2600.0) 
	            System.out.println("Su tasa es del  15%");
	            System.out.println("Puede deducir hasta R$ 350");

	        if(salario < 3750.0) 
	            System.out.println("Su tasa es del  22,5%");
	            System.out.println("Puede deducir hasta R$ 636");
	    
		}
		
	}

}
