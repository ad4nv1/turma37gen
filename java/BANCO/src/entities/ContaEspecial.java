package entities;

public class ContaEspecial extends Conta{
	
	private double limite = 1000.0;

	public ContaEspecial() {
		
	}
	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void usarLimite(double valor) {
		this.saldo += valor;
		this.limite-=valor;
	}

}
