package Ejercicio9BloquePOO;

public class Triangulo extends Poligono {

	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo (double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		
	}

	@Override
	public double calcArea() {
		double semiPerimetro = (lado1 + lado2 + lado3)/2;
		return Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
		
	}

	@Override
	public String toString() {
		return "\n\nDatos del triangulo: \n"
				+ super.toString()
				+ "\nLado1: " + lado1 
				+ "\nLado2: " +lado2 
				+ "\nLado3: " +lado3
				+ "\nArea: " + calcArea();
	}
	
}
