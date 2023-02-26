 package bytebank_heredado;

public class Gerente extends Funcionario implements Autenticable{
	
	AutenticarUtil util = new AutenticarUtil();
	
	public double getBonificacion() {
		return super.getSalario() + super.getSalario()*0.1;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

