package Ejercicio2BloquePOO;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Tablero pizarra1 = new Tablero(100,100);
		while (pizarra1.getX() < 150 && pizarra1.getY()<150) {
			String movimiento = JOptionPane.showInputDialog("Ingresa la direccion de movimiento");
			if (movimiento.contentEquals("arriba")) {
				pizarra1.moverArriba();
			} else if (movimiento.contentEquals("abajo")) {
			pizarra1.moverAbajo();
			} else if (movimiento.contentEquals("derecha")) {
			pizarra1.moverDerecha();
			} else if (movimiento.contentEquals("izquierda")) {
			pizarra1.moverIzquierda();
			} else {
			System.out.println("Movimiento invalido");
			}
		}
	}
}

