package proyect_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta fabioCuenta = new Cuenta();
		fabioCuenta.depositar(791);
			
		fabioCuenta.retirar(291);
		
		Cuenta yuliethCuenta = new Cuenta();
		yuliethCuenta.depositar(3000);
		
		yuliethCuenta.transferir(1000, fabioCuenta);
		
		System.out.println("Saldo Fabio: " + fabioCuenta.saldo);
		System.out.println("Saldo Yulieth: " + yuliethCuenta.saldo);
		
	}
	}