package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.NotaFiscal;
import entities.Pagamento;
import entities.Produto;

public class Program {

	static List<Produto> list = new ArrayList<>();
	static Pagamento pagamento = new Pagamento();
	static NotaFiscal nota = new NotaFiscal();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		list.add(new Produto("G1-1", "Iphone 5s", 750.0));
		list.add(new Produto("G1-2", "Iphone 6", 900.0));
		list.add(new Produto("G1-3", "Iphone 7", 1500.0));
		list.add(new Produto("G1-4", "Iphone 7 P", 1999.9));
		list.add(new Produto("G1-5", "Iphone 8", 2300.0));
		list.add(new Produto("G1-6", "Iphone 8 P", 2550.9));
		list.add(new Produto("G1-7", "Iphone X", 3000.0));
		list.add(new Produto("G1-8", "Iphone 11", 6500.0));
		list.add(new Produto("G1-9", "Iphone 11 P", 7999.9));
		list.add(new Produto("G1-10", "Iphone 12", 10000.0));

		char op, opCompra = 'S';
		dadosLoja();

		do {
			System.out.print("Deseja fazer compras? S/N ");
			op = sc.next().toUpperCase().charAt(0);

			while (true) {
				if (op == 'S' || op == 'N')
					break;
				else {
					System.out.print("Digitou errado digite S/N: ");
					op = sc.next().toUpperCase().charAt(0);
				}
			}
			if (op == 'N') {
				break;
			}

			do {

				catalogo();
				System.out.print("Digite o código do produto: ");
				String codProduto = sc.next().toUpperCase();
				int cont = 0;
				for (Produto prod : list) {
					if (prod.getCodigo().equals(codProduto)) {
						System.out.println("COD       PROD           VAL          ESTOQUE");
						System.out.println(prod.toString());
						cont++;
					}
				}
				if (cont == 0) {
					limpa();
					System.out.println("Produto não encontrado");

				} else {
					System.out.print("Digite a quantidade desejada: ");
					int qtProduto = sc.nextInt();
					for (Produto prod : list) {
						if (prod.getCodigo().equals(codProduto)) {
							if (qtProduto > prod.getEstoque() || qtProduto <= 0) {
								System.out.println("quantidade inválida!!");
							} else {
								prod.setCarrinho(qtProduto);
							}
						}
					}
					System.out.println("-------CARRINHO---------");
					System.out.println("COD       PROD           VAL          ESTOQUE       Qtd Seleci.");
					for (Produto prod : list) {

						if (prod.getCarrinho() != 0) {
							System.out.println(prod.toString() + "                 " + prod.getCarrinho());
						}
					}
					System.out.println("Quer continuar comprando? S/N");
					opCompra = sc.next().toUpperCase().charAt(0);
					while (true) {
						if (op == 'S' || op == 'N') {
							break;
						} else {
							System.out.println("Opção inválida. Digite S/N: ");
							opCompra = sc.next().toUpperCase().charAt(0);
						}
					}

				}

			} while (opCompra != 'N');
			
			for (Produto prod : list) {
				if (prod.getCarrinho() != 0) {
					prod.valorDaCompra();
					prod.finalizarCompra();
				}
			}
			double totalDaCompra = 0;
			for (Produto prod : list) {
				if (prod.getCarrinho() != 0) {
					totalDaCompra += prod.getValorTotal();
				}
			}
			limpa();
			System.out.println("VALOR TOTAL DA SUA COMPRA: "+totalDaCompra);
			System.out.println("ESCOLHA UMA OPÇÃO: ");
			System.out.println("1- A VISTA (10% DE **DESCONTO**  (10% DE AUMENTO)");
			System.out.println("2- NO CARTÃO DE CRÉDITO");
			System.out.println("3- 2 VEZES NO CARTÃO (15% DE AUMENTO)");
			char opPagamento = sc.next().charAt(0);
			while(true) {
				if(opPagamento == '1' || opPagamento == '2' || opPagamento == '3') {
					break;
				}else {
					System.out.println("OPÇÃO DE PAGAMENTO INVÁLIDA \n DIGITE UMA DAS OPÇÕES: ");
					System.out.println("1- A VISTA (10% DE **DESCONTO**  (10% DE AUMENTO)");
					System.out.println("2- NO CARTÃO DE CRÉDITO");
					System.out.println("3- 2 VEZES NO CARTÃO (15% DE AUMENTO)");
					opPagamento = sc.next().charAt(0);
				}
				
			}
			//System.out.println("DESSE TOTAL 9% SÃO IMPOSTOS \n VALOR DOS IMPOSTOS: "+pagamento.imposto(totalDaCompra));
			
			switch (opPagamento) {
			case '1':
				System.out.println(nota.notaFiscal(totalDaCompra, pagamento.imposto(totalDaCompra), '1', pagamento.aVista(totalDaCompra)));
				break;
			case '2':
				System.out.println(nota.notaFiscal(totalDaCompra, pagamento.imposto(totalDaCompra), '2', pagamento.cartao(totalDaCompra)));
				break;
			case '3':
				System.out.println(nota.notaFiscal(totalDaCompra, pagamento.imposto(totalDaCompra), '3', pagamento.parcelado(totalDaCompra)));
				break;
			}
			totalDaCompra = 0;
			opCompra = 'S';
			for(Produto prod : list) {
				if(prod.getCarrinho() != 0) {
					prod.setCarrinho(0);
					prod.setValorTotal(0);
				}
			}


		} while (true);
		
		sc.close();
	}

	public static void catalogo() {
		System.out.println("COD       PROD           VAL          ESTOQUE");
		for (Produto prod : list) {
			System.out.println(prod.toString());
		}
	}

	public static void dadosLoja() {
		System.out.println("________LOJA VIAJ²________");
		System.out.println("Tecnologia de qualidade!");
		System.out.println("---------------------------");
		System.out.println("");
	}

	public static void limpa() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

}
