package Ejercicio6BloquePOO;

public class Operaciones {

	public static String sumaComp(Complejo num1, Complejo num2) {
		double sumaReal = num1.fReal + num2.fReal;
		double sumaImg = num1.fImg + num2.fImg;
		
		return "El resultado es: " + sumaReal + " + (" + sumaImg + "i)"; 
	}
	
	
}
