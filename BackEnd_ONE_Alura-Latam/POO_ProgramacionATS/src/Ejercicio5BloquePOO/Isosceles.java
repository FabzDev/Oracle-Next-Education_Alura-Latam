package Ejercicio5BloquePOO;

public class Isosceles {
	private double ladoIgual;
	private double ladoOpuesto;
	private double perimetro;
	private double area;
	
	

	public Isosceles(double ladoIgual, double ladoOpuesto) {
		super();
		this.ladoIgual = ladoIgual;
		this.ladoOpuesto = ladoOpuesto;
	}

	public double getPerimetro() {
		perimetro = ladoIgual*2 + ladoOpuesto;
		return perimetro;
	}
	
	public double getArea() {
		area = ladoOpuesto * Math.sqrt((ladoIgual*ladoIgual) - (ladoOpuesto*ladoOpuesto/4))/2;
		return area;
	}
	
	public String getMayorArea() {
		return "El area de mayor superficie es: " +  this.getArea();
	}


}



// perimetro = ladoIgual*2 + ladoOpuesto
// a^2 = h^2 + (b^2)/4 --> h = (ladoOpuesto^2/4 - ladoIgual^2)^1/2
// area = (ladoOpuesto * (ladoOpuesto^2/4 - ladoIgual^2)^1/2) /2
	