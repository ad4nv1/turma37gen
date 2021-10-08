package entities;

public class Carro {
	
	private String placa;
	private String modelo;
	private boolean ligado;
	private int anoFabricacao;
	private String fabricante;
	private int marcha;
	private double velocidade;
	
	
	public Carro(String placa, String modelo, String fabricante) {
		super();		
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	


	
	
	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public int getMarcha() {
		return marcha;
	}


	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}


	public double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	
	public void acelerar() {
		this.velocidade += 5.0;
	}
	
	public void subirMarcha() {
		if(velocidade <= 20 && velocidade!=0) {
			this.marcha = 1;
		}
		else if(velocidade > 20 && velocidade<=30) {
			this.marcha = 2;
			System.out.println("Você está na marcha"+this.marcha);
		}
		else if(velocidade > 30 && velocidade<=40) {
			this.marcha = 3;
			System.out.println("Você está na marcha"+this.marcha);
		}
		else if(velocidade > 40 && velocidade<=50) {
			this.marcha = 4;
			System.out.println("Você está na marcha"+this.marcha);
		}
		else if(velocidade > 50 && velocidade<=60) {
			this.marcha = 5;
			System.out.println("Você está na marcha"+this.marcha);
		}
		else if(velocidade > 60) {
			this.marcha = 6;
			System.out.println("Você está na marcha"+this.marcha);
		}
	}
	
	
	public double reduzir(double valor){
		return this.velocidade-=valor;
	}
	
	public boolean ligar(boolean status) {
		return this.ligado = status; 
	}


	@Override
	public String toString() {
		return "DADOS DO CARRO"
				+"Placa do carro: "
				+ placa 
				+ ", modelo do carro: "
				+ modelo 
				+ ", ele esta: " 
				+ ligado 
				+ ", o ano fabricacao é: "
				+ anoFabricacao + 
				" fabricante do carro: " 
				+ fabricante;
	}
	
		
	
	
	
	

}
