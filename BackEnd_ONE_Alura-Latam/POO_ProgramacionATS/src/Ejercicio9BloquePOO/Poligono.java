package Ejercicio9BloquePOO;

public abstract class Poligono {
	private int nlados;

	public Poligono(int nlados) {
		this.nlados = nlados;
	}

	public int getnLados() {
		return nlados;
	};

	public abstract double calcArea();

	public abstract String toString();
}
