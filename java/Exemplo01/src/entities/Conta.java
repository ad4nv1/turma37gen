package entities;

public class Conta {

	
	private int Numero;
	private String Cpf;
	private double Saldo = 10000.0;
	private boolean Ativo;
	
	
	
	
	
	
	
	public Conta() {
	
	}
	public Conta(int numero, String cpf,  boolean ativo) {
		
		Numero = numero;
		Cpf = cpf;
		Ativo = ativo;
	}
	
	
	
	
	
	
	
	
	
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public boolean isAtivo() {
		return Ativo;
	}
	public void setAtivo(boolean ativo) {
		Ativo = ativo;
	}
	

	
	
	
	
	
	
	
	public double sacar(double saque){
		return Saldo-= saque;
	}
	
	
	
	
	public double deposito(double valorDeposito){
		return Saldo+= valorDeposito;
	}
	
	
	
	
	
	
	

	
	public String toString(){
		return "O Numero da conta é = " 
				+ Numero 
				+ ", o Cpf do cliente é= " 
				+ Cpf  
				+ " e seu status de atividade é = " 
				+ Ativo
				+ " saldo da conta: "
				+ Saldo;
	}
	
	
	
	
	

	

}
