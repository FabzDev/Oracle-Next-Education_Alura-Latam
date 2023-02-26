package bytebank_heredado;

public class CuentaAhorros extends Cuenta {

		public CuentaAhorros(int agencia, int numero) {
			super(agencia, numero);
		}
		
	
		
		@Override
		public boolean retirar(double valor) {
			double comision = 0.2;
		return super.retirar(valor + comision);
		}
		
	
		public void depositar(double valor) {
			this.saldo += valor;
		}
		
		
		
}
