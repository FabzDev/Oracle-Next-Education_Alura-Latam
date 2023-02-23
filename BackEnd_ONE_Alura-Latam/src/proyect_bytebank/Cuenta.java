package proyect_bytebank;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
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
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("No están permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setNumero(int numero) {
		if(numero > 0) {
			this.numero = numero;
		}else {
			System.out.println("No están permitidos valores negativos");
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
}
