package Ejercico1BloquePOO;

public class Cuadrilatero {
	//Atributos
	private double lado1;
	private double lado2;
	
	//Metodos Constructores
	public Cuadrilatero(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Cuadrilatero(double lado) {
		this.lado1 = lado;
		this.lado2 = lado;
		
	}
	
	//Metodos normales
	public double calcularPerimetro(){
		double perimetro = this.lado1*2 + this.lado2*2;
		System.out.println("El perimetro del cuadrilatero es: "+ perimetro);
		return perimetro;
	}
	
	public double calcularArea(){
		double area = this.lado1 * this.lado2;
		System.out.println("El area del cuadrilatero es: " + area);
		return area;
	}

}
