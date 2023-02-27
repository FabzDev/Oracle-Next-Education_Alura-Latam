package EjercicoBloquePOO;

public class Cuadrilatero {
	//Atributos
	int lado1;
	int lado2;
	
	//Metodos Constructores
	public Cuadrilatero(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Cuadrilatero(int lado) {
		this.lado1 = lado;
		this.lado2 = lado;
		
	}
	
	//Metodos normales
	public int calcularPerimetro(){
		return this.lado1*2 + this.lado2*2;
	}
	
	public int calculararea(){
		return this.lado1 * this.lado2;
	}

}
