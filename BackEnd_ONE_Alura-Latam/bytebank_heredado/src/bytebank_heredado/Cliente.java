package bytebank_heredado;

public class Cliente implements Autenticable {

		String nombre;
		String documento;
		String telefono;
		AutenticarUtil util = new AutenticarUtil();
		
		public Cliente() {
			AutenticarUtil util = new AutenticarUtil();
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDocumento() {
			return documento;
		}
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
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

