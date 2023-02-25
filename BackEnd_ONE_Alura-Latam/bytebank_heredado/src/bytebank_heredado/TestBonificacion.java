package bytebank_heredado;

public class TestBonificacion {

	public static void main(String[] args) {
		
		Funcionario fabioFuncionario = new Funcionario();
		fabioFuncionario.setSalario(1500);
		
		Gerente fabioGerente= new Gerente();
		fabioGerente.setSalario(5000);
		
		Contador fabioContador = new Contador();
		fabioContador.setSalario(1000);
	
		ControlBonificacion auditoria1 = new ControlBonificacion();
		auditoria1.registrarBonificacion(fabioFuncionario);
		auditoria1.registrarBonificacion(fabioGerente);
		auditoria1.registrarBonificacion(fabioContador);
		
		
	}
	
}
