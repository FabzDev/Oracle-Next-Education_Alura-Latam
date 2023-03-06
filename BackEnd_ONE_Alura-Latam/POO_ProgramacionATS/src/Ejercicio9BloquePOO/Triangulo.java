package Ejercicio9BloquePOO;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}


	@Override
	public double calcArea() {
		return getBase() * getAltura()/2;
	}

}
