package entities;

public class ContaEstudantil extends Conta{
	
	private double limiteEstudanti=5000.00;
	
	public ContaEstudantil() {
	}
	
	public ContaEstudantil(int numero, String cpf) {
		super(numero, cpf);
		
	}

	public double getLimiteEstudanti() {
		return limiteEstudanti;
	}

	public void setLimiteEstudanti(double limiteEstudanti) {
		this.limiteEstudanti = limiteEstudanti;
	}
	
	public void usarEstudantil(double valor) {
		this.saldo+=valor;
		this.limiteEstudanti-=valor;
		
	}

	@Override
	public String toString() {
		return "CONTA ESTUDANTIL!\n"
				+ " Número: " + super.getNumero() + "\n"
				+ " Cpf: "+ super.getCpf() + "\n"
				+ " Saldo na conta: "+ saldo + "\n"
				+ " Limite restante para emprestimo " + limiteEstudanti;
	}
	


}
