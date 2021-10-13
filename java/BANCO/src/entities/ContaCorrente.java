package entities;

public class ContaCorrente extends Conta{
	
	private int contadorTalao;

	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}
	public ContaCorrente(int numero, String cpf) {
		super(numero, cpf);
	}

	public int getcontadorTalao() {
		return contadorTalao;
	}

	public void setcontadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	public void pediTalao(int quantidade) {
		saldo-=(30*quantidade);
	}

}
