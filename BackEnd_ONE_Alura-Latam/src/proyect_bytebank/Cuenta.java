package proyect_bytebank;

public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuentaDestino) {
		if(saldo >= valor) {
		this.saldo = this.saldo - valor;
		cuentaDestino.saldo = cuentaDestino.saldo + valor;
		return true;
	} else {
		return false;
	}
	}
}
