package bytebank_heredado;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	
	
//	public boolean transferir(double valor, Cuenta cuenta) {
//		if(this.getSaldo() >= valor) {
//			this.retirar(valor + 0.20);
//			cuenta.depositar(valor);
//			System.out.println("Transferencia exitosa. Nuevo saldo cuenta corriente: $" + this.getSaldo() + ".");
//			System.out.println("Nuevo saldo cuenta de ahorros: $" + cuenta.getSaldo() + ".");
//		return true;
//	}
//		return false;
//	
//	}

}
