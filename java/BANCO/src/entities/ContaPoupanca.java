package entities;

public class ContaPoupanca extends Conta{
	
	private int diaAniversarioPoupanca;
	
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public void correcao() {
		int resultado =  2021-diaAniversarioPoupanca ;
		
		if(resultado>1) {
		saldo+=((saldo*1.05)-saldo);
		}
	}
	@Override
	public String toString() {
		return "CONTA POUPAN�A!\n"
				+ " N�mero: " + super.getNumero() + "\n"
				+ " Cpf: "+ super.getCpf() + "\n"
				+ " Saldo na conta: "+ saldo + "\n"
				+ " A conta possui " + (2021-diaAniversarioPoupanca)+ " anos";
	}
	
	


}
