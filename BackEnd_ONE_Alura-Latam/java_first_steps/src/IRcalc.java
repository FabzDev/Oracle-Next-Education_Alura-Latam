
public class IRcalc {

	public static void main(String[] args) {
		double salario = 3300.0;
		double IR = 0;
		boolean IR1  = salario >= 1900.0 && salario <2800.0;
		boolean IR2  = salario >= 2800.0 && salario <3751.0;
		boolean IR3  = salario >= 3751.0 && salario <4664.0;
		
		if (IR1) {
			IR = (7.5 * salario / 100) - 142;			
		}
		if (IR2) {
			IR = (15 * salario / 100) - 350;
		}
		if (IR3) {
			IR = (22.5 * salario / 100) - 636;
		}
		
		System.out.println("El impuesto de renta a pagar es: $ USD " + IR);
		
		
		
	}
	
}
