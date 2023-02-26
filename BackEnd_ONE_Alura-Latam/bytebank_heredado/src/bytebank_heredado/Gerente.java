 package bytebank_heredado;

public class Gerente extends Funcionario implements Autenticable{
	
	AutenticarUtil util = new AutenticarUtil();
	
	public double getBonificacion() {
		return super.getSalario() + super.getSalario()*0.1;
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
}

