package Ejercicio9BloquePOO;

public class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;

	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;

	}

	@Override
	public double calcArea() {
		return lado1 * lado2;
	}

	@Override
	public String toString() {
		return "\n\nDatos del rectangulo\n" + super.toString() + "\nLado1: " + lado1 + "\nLado2: " + lado2 + "\nArea: "
				+ calcArea();

	}

}
