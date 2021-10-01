programa
{
	
	
	inclua biblioteca Tipos --> tp
	inclua biblioteca Texto --> tx
	inclua biblioteca Matematica --> mat

	funcao dadosLoja(){
		escreva ("\n________LOJA VIAJ²________")
		escreva ("\nTecnologia de qualidade!\n")
		escreva ("---------------------------")
		escreva ("\n")
	}
	
	funcao inicio()
	{
	
		cadeia loja [10][5] ={
			{"G1-1","Iphone 5s", "750.0", "10", "0"}, 
			{"G1-2", "Iphone6", "900.0", "10", "0"}, 
			{"G1-3", "Iphone 7", "1500.0", "10", "0"},
			{"G1-4", "Iphone 7 P", "1999.9", "10", "0"},
			{"G1-5", "Iphone 8", "2300.0", "10", "0"},
			{"G1-6", "Iphone 8 P", "2550.9", "10", "0"},
			{"G1-7", "Iphone X", "3000.0", "10", "0"},
			{"G1-8", "Iphone 11", "6500.0", "10", "0"},
			{"G1-9", "Iphone 11 P", "7999.9", "10", "0"},
			{"G1-10", "Iphone 12", "10000.0", "10", "0"}}

			

		cadeia op, codCompra, confirmaCompra = ""
		logico loop = verdadeiro
		inteiro opcaoPagamento = 0
		real totalCompra = 0.0, qtdCompra = 0.0, valorCompra = 0.0, imposto = 0.0, valor10Porcento = 0.0, aumento15=0.0

		dadosLoja()
		
		enquanto (loop){

			escreva ("\nVocê deseja fazer compras? (S/N): ")
			leia (op)
			op = tx.caixa_alta(op)
			enquanto ((op != "S") e (op != "N")){
			escreva("Digite S ou N:")
			leia (op)	
			op= tx.caixa_alta(op)
			}

			se (op == "N"){
				escreva ("\nATÉ BREVE!!!\n")
				pare
				}

				
			
			para(inteiro x = 0;x<1;x++){
				escreva ("\n_____________________NOSSOS PRODUTOS____________________")
				escreva ("\nCÓDIGO           PRODUTO          VALOR         ESTOQUE ")
				escreva ("\n********************************************************\n")
				//escreva ("\n--------------------------------------------------------\n")
				para (inteiro i=0; i<10; i++){
					para (inteiro j=0;j<4; j++){
						escreva ("[ "+loja[i][j]+" ]\t")		
					}
					escreva ("\n------------------------------------------------------")
					escreva ("\n")
				}
			}
			escreva ("CARRINHO DE COMPRAS: \n")
			para (inteiro i=0; i<10; i++){
						se(loja[i][4]!= "0"){
							escreva(
							loja[i][0],"  ",
							loja[i][1], 
							"  ",loja[i][2],
							"  ",loja[i][3],
							"  ",qtdCompra,"\n")
							}
			}
			
			escreva("\n")
			escreva("*****************************************************************\n")
			escreva("\n")

			faca{
			escreva ("\n____VAMOS AS COMPRAS <3___\n")
			escreva ("Digite o código do produto que deseja comprar: ")
			leia (codCompra)
			codCompra = tx.caixa_alta(codCompra)
			escreva ("CÓDIGO           PRODUTO          VALOR         ESTOQUE \n")
			para(inteiro i=0;i<10;i++){
				se(codCompra == loja[i][0]){
					escreva(
						loja[i][0],
						"\t", loja[i][1],
						"\t", loja[i][2],
						"\t",loja[i][3],"\n")
				}
			}
			escreva("\n")
			escreva("*****************************************************************\n")
			escreva("\n")
			escreva ("Digite a quantidade: ")
			leia (qtdCompra)
			para(inteiro i=0;i<10;i++){
					se(codCompra == loja[i][0]){
						se(qtdCompra < tp.cadeia_para_real(loja[i][3])){
							loja[i][4] = tp.real_para_cadeia(qtdCompra)	
						}
						senao{
							escreva ("Não possui estoque sufuciente. \n")
							
						}
					}
				}
			escreva("\n")
			escreva("*****************************************************************\n")
			escreva("\n")
			escreva ("CARRINHO DE COMPRAS: \n")
			escreva ("*********************\n")
			para (inteiro i=0; i<10; i++){
						se(loja[i][4]!= "0"){
							escreva("COD: ",
							loja[i][0],"  PRODUTO: ",
							loja[i][1], 
							"  ",loja[i][2],
							"  QTD ESTOQUE: ",loja[i][3],
							"  QTD SELECIONADA: ",loja[i][4],"\n")
							}
			}
			escreva("\n")
			escreva("*****************************************************************\n")
			escreva("\n")
			escreva("\ndeseja continuar comprando? (S/N) ")
			leia(confirmaCompra)
			confirmaCompra = tx.caixa_alta(confirmaCompra)
			se(confirmaCompra == "N"){
				pare
			}
			}enquanto(loop)
			para (inteiro i=0; i<10; i++){
				valorCompra = tp.cadeia_para_real(loja[i][2])*tp.cadeia_para_real(loja[i][4])
				loja[i][3] = tp.real_para_cadeia(tp.cadeia_para_real(loja[i][3])-tp.cadeia_para_real(loja[i][4]))
				totalCompra+=valorCompra
					
			}
			
			escreva("\n")
			dadosLoja()
			escreva("\n")
			escreva("Valor total da compra: ", totalCompra, "\n")
			escreva("\n")
			imposto = totalCompra*0.09
			escreva("Terá ", imposto, " em imposto sobre a compra \n")
			escreva("\n")
			valor10Porcento = totalCompra*0.10
			escreva("Caso o valor seja pago a vista terá: ", valor10Porcento, " de desconto\n")
			escreva("\n")
			escreva("Caso o valor seja pago no cartão terá: ", valor10Porcento, " de acrescimo\n")
			escreva("\n")
			aumento15 = totalCompra*0.15
			escreva("Caso o valor seja pago no cartão em 2 vezes terá: ", aumento15, " de acrescimo\n")
			escreva("\n")
			escreva("*****************************************************************\n")
			escreva("\n")
			escreva("escolha uma opção de pagamento: 1- A Vista; 2 - Cartão; 3 - Três vezes no cartão \n")
				leia(opcaoPagamento)
			enquanto(loop){
				se(opcaoPagamento == 1 ou opcaoPagamento == 2 ou opcaoPagamento == 3){
					pare
				}senao{
					escreva("OPÇÃO INVÁLIDA, DIGITE UM DOS 3 NUMEROS \n")
					leia(opcaoPagamento)
					
				}
				
			}
			escreva("escolha uma opção de pagamento: 1- A Vista; 2 - Cartão; 3 - Três vezes no cartão \n")
			leia(opcaoPagamento)
			escreva("\n")
			escreva("*****************************************************************\n")
			escreva("*****************************************************************\n")
			escreva("************************NOTA FISCAL******************************\n")
			escreva("*****************************************************************\n")
			escreva("*****************************************************************\n")
			escreva("\n")
			escreva("VALOR DA COMPRA S/IMPOSTO: ", totalCompra, "\n")
			escreva ("------------------------------------------------------\n")
			escreva("VALOR DA COMPRA C/IMPOSTO: ", (totalCompra+valor10Porcento), "\n")
			escreva ("------------------------------------------------------\n")
			escreva("ITEMS DA COMPRA: \n")
			para (inteiro i=0; i<10; i++){
						se(loja[i][4]!= "0"){
							escreva("  PRODUTO: ",loja[i][1],"  PREÇO :",loja[i][2],
							"  QTD COMPRADA: ",loja[i][4],"\n")
							}
			}
			escreva ("------------------------------------------------------\n")
			escreva("FORMA DE PAGAMENTO SELECIONADA: \n")
			escolha(opcaoPagamento){
				caso 1:
					escreva("PAGAMENTO A VISTA, DESCONTO DE 10%, VALOR FINAL: ",
					((totalCompra+imposto)- valor10Porcento),"\n")
					pare
				caso 2:
					escreva("PAGAMENTO NO CARTÃO, ACRESCIMO DE 10%, VALOR FINAL: ",
					((totalCompra+imposto)+ valor10Porcento),"\n")
					pare
				caso 3:
					escreva("PAGAMENTO NO CARTÃO EM 2X, ACRESCIMO DE 15%, VALOR DAS PARCELAS: ",
					mat.arredondar((((totalCompra+imposto)+ aumento15)/2),2),"\n")

			}
			escreva("*****************************************************************\n")
			escreva("*****************************************************************\n")
			escreva("OBRIGADO POR USAR NOSSOS SERVIÇOS\n")
			para (inteiro i=0; i<10; i++){
				loja[i][4] = "0"
			}
			totalCompra = 0.0
			qtdCompra = 0.0 
			valorCompra = 0.0 
			imposto = 0.0 
			valor10Porcento = 0.0
			aumento15=0.0
			}
			
		}
				
	}


	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 7328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */