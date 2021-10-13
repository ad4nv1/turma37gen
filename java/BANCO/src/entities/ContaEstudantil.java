package entities;

public class ContaEstudantil extends Conta{
	
	private double limiteEstudanti=5000.00;
	
	public ContaEstudantil() {
	}
	
	public ContaEstudantil(int numero, String cpf, double limiteEstudanti) {
		super(numero, cpf);
		this.limiteEstudanti = limiteEstudanti;
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
	


}
