package bytebank_heredado;

public class ControlBonificacion{
	double total;
	
	public double registrarBonificacion(Funcionario funcionario){
		this.total = funcionario.getBonificacion() + this.total;
		System.out.println("Calculo actual" + this.total);
		return this.total;
	}	
}
