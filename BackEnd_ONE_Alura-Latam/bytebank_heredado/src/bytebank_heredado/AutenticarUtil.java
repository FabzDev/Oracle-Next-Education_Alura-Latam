package bytebank_heredado;

public class AutenticarUtil {
	
	String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
}
