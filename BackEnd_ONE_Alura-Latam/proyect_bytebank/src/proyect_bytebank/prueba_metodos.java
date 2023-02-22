package proyect_bytebank;

public class prueba_metodos {
	
	public static void main(String[] args) {
		Cuenta fabioCuenta = new Cuenta();
		
//		fabioCuenta.saldo = 800;
		fabioCuenta.depositar(1000);
		
		System.out.println(fabioCuenta.saldo);
	}
	
}
