package entities;

public class Cavalo extends Animal{
	
	private String som;
	
	
	public Cavalo(String nome, int idade, String som) {
		super(nome, idade);
		this.som = som;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	@Override
	public String habilidade() {
		return "CORREEEEE!!!";
		
	
	}
	
	

}
