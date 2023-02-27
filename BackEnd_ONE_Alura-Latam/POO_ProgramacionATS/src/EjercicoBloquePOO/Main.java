package EjercicoBloquePOO;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del lado1"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del lado2"));
		Cuadrilatero figura1 = new Cuadrilatero(lado1);
		
		System.out.println(figura1.calcularPerimetro());

		
	}
	
}
