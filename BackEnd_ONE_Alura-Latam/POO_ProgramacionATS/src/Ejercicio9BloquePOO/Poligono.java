package Ejercicio9BloquePOO;

public abstract class Poligono {
	private double base;
	private double altura;

	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public abstract double calcArea();

	public void mostrarDatos(int i, String figura) {
		System.out.println("\n\nDatos "+figura+" # "+ (i+1) +" \nBase: " + base + "\nAltura: " +altura + "\nArea: " + calcArea());
	};
}

//
//
//
//
//
//
//
//
//
//
//
//
//areaCuadrado = b * h;
//areaTriangulo = (b * h)/2
