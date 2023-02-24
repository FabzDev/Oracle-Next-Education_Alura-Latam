package bytebank_heredado;

public class Gerente extends Funcionario{
	String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean autenticar(String clave) {
		return clave == "ONE-Alura";
	}
	
	public double getBonificacion() {
		return super.getSalario();
	}
	
}
