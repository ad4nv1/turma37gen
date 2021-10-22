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

		String codCadastroProduto, nomeCadastroProduto, codRenovarProduto;
		double valorCadastroProduto, totalDaCompra;
		int estoqueCadastroProduto, estoqueRenovaProduto,contCodProduto;

		char op, opCompra = 'S', opFinalProprietario= 'S';
		dadosLoja();

		do {
			System.out.println("Você é? \n 1- proprietario da loja \n 2- cliente \n 3- sair");
			char opUsuario = sc.next().charAt(0);
			while (true) {
				if (opUsuario == '1' || opUsuario == '2'|| opUsuario == '3') {
					break;
				} else {
					System.out.println(
							"Desculpe, mas essa opção é inválida. \n digite: \n 1- proprietário \n 2- cliente");
					opUsuario = sc.next().charAt(0);
				}
			}
			if(opUsuario == '3') {
				break;
			}
			
			if (opUsuario == '1') {
				do {
					System.out.println("SEJA BEM VINDO!!!");
					System.out.println("O QUE DESEJA FAZER? ");
					System.out.println("1- CADASTRAR NOVO PRODUTO");
					System.out.println("2- RENOVAR ESTOQUE");
					char opProprietario = sc.next().charAt(0);
					while (true) {
						if (opProprietario == '1' || opProprietario == '2') {
							break;
						} else {
							System.out.println("Desculpe, mas essa opção é inválida. "
									+ "\n digite: \n 1- CADASTRAR NOVO PRODUTO \n 2- RENOVAR ESTOQUE");
							opProprietario = sc.next().charAt(0);
						}
					}
					if (opProprietario == '1') {
						while (true) {
							
							System.out.println("Digite o código do produto: ");
							codCadastroProduto = sc.next().toUpperCase();
							contCodProduto = 0;
							for (Produto prod : list) {
								if (prod.getCodigo().equals(codCadastroProduto))
								{
									contCodProduto++;
								}
							}
							if (contCodProduto > 0) {
								System.out.println("Produto já cadastrado!!");
								//continue;
								
							} else {
								
								break;
							}
						}
						while (true) {
							
							sc.nextLine();
							System.out.println("Digite o nome do produto: ");
							nomeCadastroProduto = sc.nextLine().toUpperCase();
							int contNomeProduto = 0;
							for (Produto prod : list) {
								if (prod.getProduto().equals(nomeCadastroProduto))
									
								{
									contNomeProduto++;
								}
							}
							if (contNomeProduto > 0) {
								limpa();
								System.out.println("Produto já cadastrado!! Tecle ENTER para prosseguir. ");
								continue;
							} else {
								break;
							}
						}
						while (true) {
				
							System.out.println("Digite o valor do produto: ");
							valorCadastroProduto = sc.nextDouble();
							if (valorCadastroProduto <= 0) {
								System.out.println("O valor digitado é inválido!!");
								continue;
							} else {
								break;
							}

						}
						while (true) {
					
							System.out.println("Digite a quantidade em estoque: ");
							estoqueCadastroProduto = sc.nextInt();
							if (estoqueCadastroProduto <= 0) {
								System.out.println("O valor digitado é inválido!!");
								continue;
							} else {
								break;
							}
						}

						list.add(new Produto(codCadastroProduto, nomeCadastroProduto, valorCadastroProduto,
								estoqueCadastroProduto));

					} else if (opProprietario == '2') {
						limpa();
						System.out.println("Esses são os protudos e seus respectivos estoques");
						System.out.println("--------------------------------------------------");
						System.out.println("COD:          ESTOQUE:");
						for (Produto prod : list) {
							System.out.println(prod.produtoEstoque());
						}
						while (true) {							
							System.out.println("Digite o código do produto para renovar estoque: ");
							codRenovarProduto = sc.next().toUpperCase();
							int contCodRenovaProduto = 0;
							for (Produto prod : list) {
								if (prod.getCodigo().equals(codRenovarProduto))
								{
									contCodRenovaProduto++;
								}
							}
							if (contCodRenovaProduto == 0) {
								System.out.println("Produto não encontrado!!");
								continue;
							} else {
								break;
							}
						}
						while (true) {
							System.out.println("Digite a quantidade que deseja adicionar no estoque: ");
							estoqueRenovaProduto = sc.nextInt();
							if (estoqueRenovaProduto <= 0) {
								System.out.println("O valor digitado é inválido!!");
								continue;
							} else {
								break;
							}
						}

						for (Produto prod : list) {
							if (prod.getCodigo().equals(codRenovarProduto)) {
								prod.setEstoque(prod.getEstoque() + estoqueRenovaProduto);
							}
						}

						limpa();
						System.out.println("PRODUTOS APÓS A RENOVAÇÃO DO ESTOQUE: ");
						System.out.println("---------------------------------------");
						System.out.println("COD:          ESTOQUE:");
						for (Produto prod : list) {
							System.out.println(prod.produtoEstoque());
						}

					}
					System.out.println("Deseja continuar suas atividades na loja? S/N ");
					opFinalProprietario = sc.next().toUpperCase().charAt(0);
					while (true) {
						if (opFinalProprietario == 'S' || opFinalProprietario == 'N') {
							break;
						} else {
							System.out.println("Opção inválida, digite S ou N: ");
							opFinalProprietario = sc.next().toUpperCase().charAt(0);
						}
					}
					//if (opFinalProprietario == ) {
					//	break;
					//}

				} while (!(opFinalProprietario=='N'));
			}

			else if (opUsuario == '2') {

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
									if (qtProduto > prod.getEstoque() || qtProduto < 0) {
										System.out.println("quantidade inválida!!");
									} else {
										prod.setCarrinho(qtProduto);
									}
								}
							}
							int contApareceCarrinho=0;
							for(Produto prod : list) {
								if(prod.getCarrinho() > 0) {
									contApareceCarrinho++;
								}
							}
							if(contApareceCarrinho>0) {
								System.out.println("-------CARRINHO---------");
								System.out.println("COD       PROD           VAL          ESTOQUE       Qtd Seleci.");
								for (Produto prod : list) {
									
									if (prod.getCarrinho() != 0) {
										System.out.println(prod.toString() + "                 " + prod.getCarrinho());
									}
								}
							}else {
								System.out.println("CARRINHO VAZIO!!");
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
					
					int contConfirmaCompra=0;
					for (Produto prod : list) {
						if (prod.getCarrinho() != 0) {
							prod.valorDaCompra();
							prod.finalizarCompra();
							contConfirmaCompra++;
						}
					}
					if(contConfirmaCompra>0) {
					totalDaCompra = 0;
					for (Produto prod : list) {
						if (prod.getCarrinho() != 0) {
							totalDaCompra += prod.getValorTotal();
						}
					}
					limpa();
					System.out.println("VALOR TOTAL DA SUA COMPRA: " + totalDaCompra);
					System.out.println("ESCOLHA UMA OPÇÃO: ");
					System.out.println("1- A VISTA (10% DE **DESCONTO**  ");
					System.out.println("2- NO CARTÃO DE CRÉDITO (10% DE AUMENTO)");
					System.out.println("3- 2 VEZES NO CARTÃO (15% DE AUMENTO)");
					char opPagamento = sc.next().charAt(0);
					while (true) {
						if (opPagamento == '1' || opPagamento == '2' || opPagamento == '3') {
							break;
						} else {
							System.out.println("OPÇÃO DE PAGAMENTO INVÁLIDA \n DIGITE UMA DAS OPÇÕES: ");
							System.out.println("1- A VISTA (10% DE **DESCONTO**)");
							System.out.println("2- NO CARTÃO DE CRÉDITO (10% DE AUMENTO)");
							System.out.println("3- 2 VEZES NO CARTÃO (15% DE AUMENTO)");
							opPagamento = sc.next().charAt(0);
						}

					}

					switch (opPagamento) {
					case '1':
						System.out.println(nota.notaFiscal(totalDaCompra, pagamento.imposto(totalDaCompra), '1',
								pagamento.aVista(totalDaCompra)));
						break;
					case '2':
						System.out.println(nota.notaFiscal(totalDaCompra, pagamento.imposto(totalDaCompra), '2',
								pagamento.cartao(totalDaCompra)));
						break;
					case '3':
						System.out.println(nota.notaFiscal(totalDaCompra, pagamento.imposto(totalDaCompra), '3',
								pagamento.parcelado(totalDaCompra)));
						break;
					}
					System.out.println("PRODUTOS COMPRADOS:");
					for(Produto prod : list) {
						if(prod.getCarrinho() != 0) {
							System.out.println("PRODUTO: "+ prod.getProduto() + " qtd.: "+prod.getCarrinho());
						}
					}
					}else {
						System.out.println("VOCÊ NÃO COMPROU NADA!!!");
					}
					totalDaCompra = 0;
					opCompra = 'S';
					for (Produto prod : list) {
						if (prod.getCarrinho() != 0) {
							prod.setCarrinho(0);
							prod.setValorTotal(0);
						}
					}

				} while (true);
			}

		} while (true);
		
		System.out.println("OBRIGADO POR USAR NOSSOS SERVIÇOS!!");
		
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