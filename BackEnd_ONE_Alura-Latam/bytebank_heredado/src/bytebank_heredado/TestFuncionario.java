package bytebank_heredado;

public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario fabioDian = new Funcionario();
		fabioDian.setNombre("Fabio Escobar");
		fabioDian.setDocumento("1140826532");
		fabioDian.setSalario(3000);
		System.out.println(fabioDian);
		System.out.println(fabioDian.getBonificacion());
	}
	
	
	
}
