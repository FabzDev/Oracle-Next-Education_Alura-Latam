package Ejercicio9BloquePOO;

public class Rectangulo extends Poligono {

	public Rectangulo(double base, double altura) {
		super(base, altura);
	}


	@Override
	public double calcArea() {
		return getBase() * getAltura();
	}

}
