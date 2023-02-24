package proyect_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		
		Cuenta fabioCuenta = new Cuenta(123, 456);
		fabioCuenta.depositar(791);
			
		
		fabioCuenta.retirar(291);
		
		Cuenta yuliethCuenta = new Cuenta(789, 1011);
		yuliethCuenta.depositar(3000);
		
		yuliethCuenta.transferir(1000, fabioCuenta);
		
		System.out.println("Saldo Fabio: " + fabioCuenta.getSaldo());
		System.out.println("Saldo Yulieth: " + yuliethCuenta.getSaldo());
	

		Cliente fabio = new Cliente();
		fabio.nombre = "Fabio Escobar";
		fabio.telefono = "3006336108";
		fabio.documento = "id12395";
		fabioCuenta.setTitular(fabio);
		
		Cliente yulieth= new Cliente();
		yulieth.nombre = "Yulieth Horta";
		yulieth.telefono = "3004134656";
		yulieth.documento = "id45695";
		yuliethCuenta.setTitular(yulieth);
		
		System.out.println(fabioCuenta.getTitular().nombre);
		System.out.println(fabio.nombre);
		
		System.out.println(yuliethCuenta.getTitular().nombre);
		System.out.println(yulieth.nombre);
		
		fabioCuenta.setAgencia(1323);
		System.out.println(fabioCuenta.getAgencia());
		
		fabioCuenta.setNumero(909623);
		System.out.println(fabioCuenta.getNumero());
		
		Cuenta alejandroCuenta = new Cuenta(1213, 1415);
		
		System.out.println("Se han creado " + Cuenta.getContador() + " cuentas");
		
	}
	}