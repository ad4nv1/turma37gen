package entities;

public class ContaCorrente extends Conta{
	
	private int contadorTalao;

	public ContaCorrente() {
		
	}
	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		
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
	
	public void pediTalao() {
		saldo-=(30*contadorTalao);
	}
	
	@Override
	public String toString() {
		return "CONTA CORRENTE!\n"
				+ " Número: " + super.getNumero() + "\n"
				+ " Cpf: "+ super.getCpf() + "\n"
				+ " Saldo na conta: "+ saldo + "\n"
				+ " Quantidade de taloes adquiridos " + contadorTalao;
	}

}
