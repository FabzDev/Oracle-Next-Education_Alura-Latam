package bytebank_heredado;

public class testGerente {

	public static void main(String[] args) {
		
		Gerente fabioManager = new Gerente();
		fabioManager.setNombre("Fabio Escobar");
		fabioManager.setDocumento("1140829342");
		fabioManager.setSalario(1500);
		System.out.println(fabioManager.getNombre());
		System.out.println(fabioManager.getDocumento());
		System.out.println(fabioManager.getSalario());
		System.out.println("Sesion iniciada: " + fabioManager.autenticar("ONE-Alura"));
		System.out.println("Bonificacion mensual: "+fabioManager.getBonificacion());
		
		
	}
}
