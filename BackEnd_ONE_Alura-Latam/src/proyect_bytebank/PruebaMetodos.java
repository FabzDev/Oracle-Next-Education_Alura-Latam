package proyect_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta fabioCuenta = new Cuenta();
		fabioCuenta.depositar(791);
			
		fabioCuenta.retirar(291);
		
		Cuenta yuliethCuenta = new Cuenta();
		yuliethCuenta.depositar(3000);
		
		yuliethCuenta.transferir(1000, fabioCuenta);
		
		System.out.println("Saldo Fabio: " + fabioCuenta.getSaldo());
		System.out.println("Saldo Yulieth: " + yuliethCuenta.getSaldo());
	

		Cliente fabio = new Cliente();
		fabio.nombre = "Fabio Escobar";
		fabio.telefono = "3006336108";
		fabio.documento = "id12395";
		fabioCuenta.titular = fabio;
		
		Cliente yulieth= new Cliente();
		yulieth.nombre = "Yulieth Horta";
		yulieth.telefono = "3004134656";
		yulieth.documento = "id45695";
		yuliethCuenta.titular = yulieth;
		
		System.out.println(fabioCuenta.titular.nombre);
		System.out.println(fabio);
		
		System.out.println(yuliethCuenta.titular);
		System.out.println(yulieth);
		
		fabioCuenta.setAgencia(1323);
		System.out.println(fabioCuenta.getAgencia());
		
		fabioCuenta.setNumero(909623);
		System.out.println(fabioCuenta.getNumero());
		
	}
	}