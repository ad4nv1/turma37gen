package entities;

public abstract class Conta {
	
	private int numero;
	private String cpf;
	protected double saldo=0;
	private boolean ativo = true;
	
	public Conta() {
	}
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void debito(double valor) {
		saldo-=valor;
	}
	
	public void credito(double valor) {
		saldo+=valor;
	}
	
	
	

}
