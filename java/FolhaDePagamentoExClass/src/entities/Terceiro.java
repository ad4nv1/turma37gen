package entities;

public class Terceiro extends Clt{
	private double adicional;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public Terceiro() {
		
	}

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}     

	@Override
	public double salario() {
		
		return super.salario() + adicional;
	}
	
	
}
