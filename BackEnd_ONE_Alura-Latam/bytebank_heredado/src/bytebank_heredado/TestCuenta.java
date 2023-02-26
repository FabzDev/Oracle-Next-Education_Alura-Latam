package bytebank_heredado;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1,2);
		CuentaAhorros ca = new CuentaAhorros(3,4);

//		ca.depositar(2000);
//		System.out.println(ca.transferir(500, cc));
//		System.out.println("Nuevo saldo cuenta corriente: $" + cc.getSaldo());
//		System.out.println("Nuevo saldo cuenta de ahorros: $" + ca.getSaldo());
		
		cc.depositar(5000);
		System.out.println(cc.transferir(1000, ca));
		System.out.println("Nuevo saldo cuenta de ahorros: $" + ca.getSaldo());
		System.out.println("Nuevo saldo cuenta corriente: $" + cc.getSaldo());

	}
}
