package bytebank_heredado;

public class ControlBonificacion extends Funcionario{
	double total;
	
	public double registrarBonificacion(Funcionario funcionario){
		this.total += funcionario.getBonificacion();
		System.out.println(this.total);
		return this.total;
	}
	
}
