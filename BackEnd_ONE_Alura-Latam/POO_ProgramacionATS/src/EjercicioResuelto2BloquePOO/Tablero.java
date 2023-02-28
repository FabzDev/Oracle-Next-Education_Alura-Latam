package EjercicioResuelto2BloquePOO;

public class Tablero {
	//Atributos
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//Metodo Constructor
	public Tablero(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Metodos normales
	public void moverArriba(int incremento) {
		this.y -= incremento;
		
	}
	
	public void moverAbajo(int incremento) {
	this.y += incremento;
	}
	
	public void moverDerecha(int incremento) {
	this.x += incremento;	
	}
	
	public void moverIzquierda(int incremento) {
		this.x -= incremento;
	}
}
