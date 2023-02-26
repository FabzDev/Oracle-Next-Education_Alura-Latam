package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticable {
	
	AutenticarUtil util = new AutenticarUtil();
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
		
	}

	@Override
	public void setClave(String clave) {
		util.setClave(clave);
		
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return util.iniciarSesion(clave);
	}

}
