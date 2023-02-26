package bytebank_heredado;

public class CuentaCorriente extends Cuenta{

	private double valorComision = 0.5;
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean retirar(double valor) {
	double nuevoValor = valor + this.valorComision;
	return super.retirar(nuevoValor);
	}
	
	@Override
	public boolean transferir(double valor, Cuenta cuentaDestino) {
	return super.transferir(valor, cuentaDestino);
	}

}
