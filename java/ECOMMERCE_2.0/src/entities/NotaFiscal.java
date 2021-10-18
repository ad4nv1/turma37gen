package entities;

public class NotaFiscal {
	
	
	public String notaFiscal (double valorTotal, double imposto, char op, double pagamento) {
		String modoPagamento="";
		if (op=='1') {
			modoPagamento=" O pagamento teve um desconto de 10% ";
		}
		else if (op=='2') {
			modoPagamento="  O pagamento teve um aumento de 10% ";
		}
		else if (op=='3') {
			modoPagamento=" O pagamento teve um aumento de 15% parcelado em duas vezes de: ";
		}
		return "*******************************************************\n" 
				+ "*******************************************************\n"
				+ "**********************NOTA FISCAL**********************\n"
				+ "*******************************************************\n" 
				+ "*******************************************************\n"
				+ "VALOR DA COMPRA: "+valorTotal+"\n"
				+ "VALOR EM IMPOSTOS: "+imposto+"\n"
				+ modoPagamento + String.format("%.2f", pagamento);
		
	}

}