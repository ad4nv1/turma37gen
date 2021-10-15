package entities;

public class Produto {
	//CODIGO[] PRODUTO[] VALOR[] ESTOQUE[] 
	private String codigo;
	private String produto;
	private double valor;
	protected int estoque = 10;
	private int carrinho;
	private double valorTotal;
	
	
	public Produto() {
		
	}
	public Produto(String codigo, String produto, double valor) {
		this.codigo = codigo;
		this.produto = produto;
		this.valor = valor;

	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setCarrinho(int carrinho) {
		this.carrinho = carrinho;
	}
	public int getCarrinho() {
		return carrinho;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void valorDaCompra() {
		this.valorTotal = valor*carrinho;
	}
	
	public void finalizarCompra() {
			this.estoque-=this.carrinho;			
	}
	
	@Override
	public String toString() {
		return  codigo + "\t" + produto + "\t" + valor + "\t\t" + estoque ;
	}
	
	
	
	
	
}
