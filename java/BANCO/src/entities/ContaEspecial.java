package entities;

public class ContaEspecial extends Conta{
	
	private double limite = 1000.0;

	public ContaEspecial() {
		
	}
	public ContaEspecial(int numero, String cpf) {
		super(numero, cpf);
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
	
	@Override
	public String toString() {
		return "CONTA ESPECIAL!\n"
				+ " Número: " + super.getNumero() + "\n"
				+ " Cpf: "+ super.getCpf() + "\n"
				+ " Saldo na conta: "+ saldo + "\n"
				+ " Limite DE CREDITO RESTANTE " + limite;
	}

}
