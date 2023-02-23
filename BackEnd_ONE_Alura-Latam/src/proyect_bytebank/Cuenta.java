package proyect_bytebank;

public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		}
	
	
	public boolean transferir(double valor, Cuenta cuentaDestino) {
		if(saldo >= valor) {
		this.saldo -= valor;
		cuentaDestino.depositar(valor);
		return true;
	}
		return false;
	
	}
}
