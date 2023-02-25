package bytebank_heredado;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
//	private Cliente titular;
	private static int contador;
	
	public Cuenta(int agencia, int numero) {
		sumContador();
//		System.out.println("Cuenta #" + contador);
		this.agencia = agencia;
		this.numero = numero;
	}
	
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
		this.retirar(valor);
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
	
//	public void setTitular(Cliente cliente) {
//		this.titular = cliente;
//	}
	
//	public Cliente getTitular() {
//		return this.titular;
//	}
	
	public static int getContador() {
		return Cuenta.contador;
	}
	
	public static void sumContador() {
		Cuenta.contador ++;
	}
	
	
	
	
}

