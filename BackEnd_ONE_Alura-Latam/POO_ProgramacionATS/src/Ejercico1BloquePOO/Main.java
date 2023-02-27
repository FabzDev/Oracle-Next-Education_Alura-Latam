package Ejercico1BloquePOO;

import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args) {
		Cuadrilatero figura1;
		
		double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado1"));
		double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado2"));
			
		if(lado1 == lado2) {
			figura1 = new Cuadrilatero(lado1);					
		} else {
			figura1 = new Cuadrilatero(lado1, lado2);				
		}
		
		figura1.calcularPerimetro();				
		figura1.calcularArea();
	}
}
