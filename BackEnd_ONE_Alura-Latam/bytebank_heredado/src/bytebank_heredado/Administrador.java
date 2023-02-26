package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticable {
	
	private AutenticarUtil util;
	
	
	public Administrador() {
		this.util = new AutenticarUtil();
	}
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
		
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
