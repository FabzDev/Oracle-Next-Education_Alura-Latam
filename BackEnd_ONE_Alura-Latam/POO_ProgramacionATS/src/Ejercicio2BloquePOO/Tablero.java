package Ejercicio2BloquePOO;

public class Tablero {
	//Atributos
	double x;
	double y;
	
	//Metodo Constructor
	public Tablero(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Metodos normales
	public void moverArriba() {
		this.y -= 10;
		System.out.println("Movimiento: arriba");
		System.out.println("Nuevas coordenadas: X: "+this.x);
		System.out.println("Nuevas coordenadas: Y: "+this.y);
		
	}
	
	public void moverAbajo() {
	this.y += 10;
	System.out.println("Movimiento: abajo");
	System.out.println("Nuevas coordenadas: X: "+this.x);
	System.out.println("Nuevas coordenadas: Y: "+this.y);
	}
	
	public void moverDerecha() {
	this.x += 10;
	System.out.println("Movimiento: derecha");
	System.out.println("Nuevas coordenadas: X: "+this.x);
	System.out.println("Nuevas coordenadas: Y: "+this.y);		
	}
	
	public void moverIzquierda() {
		this.x -= 10;
		System.out.println("Movimiento: izquierda");
		System.out.println("Nuevas coordenadas: X: "+this.x);
		System.out.println("Nuevas coordenadas: Y: "+this.y);	
	}
}
