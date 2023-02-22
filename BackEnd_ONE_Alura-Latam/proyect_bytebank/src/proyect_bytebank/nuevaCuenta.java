package proyect_bytebank;

public class nuevaCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo=1000;
		
		System.out.println(primeraCuenta.titular);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo=500;
		
		System.out.println(segundaCuenta.saldo);
	}
}
