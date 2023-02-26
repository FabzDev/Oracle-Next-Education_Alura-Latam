package bytebank_heredado;

public class SistemaInterno {
	private String clave = "1234"; 
	
	public boolean autenticaFuncionario(Autenticable funcionarioAutenticable) {
		boolean puedeIniciarSesion = funcionarioAutenticable.iniciarSesion(this.clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
