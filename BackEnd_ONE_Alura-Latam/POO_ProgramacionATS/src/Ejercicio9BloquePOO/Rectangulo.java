package Ejercicio9BloquePOO;

public class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;
	
	public Rectangulo(int nlados, double lado1, double lado2) {
		super(nlados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}

	@Override
	public double calcArea() {
		double area = lado1 * lado2;
		return area;
	}

	@Override
	public String toString() {
		System.out.println("\n\nDatos del rectangulo:\nLado1: " + lado1
				+ "\nLado2: " +lado2
				+ "\nArea: " + calcArea());
		return null;
	}



}
