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
			{"G1-1","Iphone 5s", "750.00", "10", "0"}, 
			{"G1-2", "Iphone6", "900.00", "10", "0"}, 
			{"G1-3", "Iphone 7", "1500.00", "10", "0"},
			{"G1-4", "Iphone 7 P", "1999.90", "10", "0"},
			{"G1-5", "Iphone 8", "2300.00", "10", "0"},
			{"G1-6", "Iphone 8 P", "2550.90", "10", "0"},
			{"G1-7", "Iphone X", "3000.00", "10", "0"},
			{"G1-8", "Iphone 11", "6500.00", "10", "0"},
			{"G1-9", "Iphone 11 P", "7999.90", "10", "0"},
			{"G1-10", "Iphone 12", "10000.00", "10", "0"}}

			

		cadeia nome, op, codCompra, confirma, novoProduto, confirmaCompra = ""
		logico loop = verdadeiro
		real totalCompra = 0.0, qtdCompra = 0.0, valorCompra = 0.0, imposto = 0.0, descontoAVista = 0.0

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
			
			escreva ("Digite a quantidade: ")
			leia (qtdCompra)
			para(inteiro i=0;i<10;i++){
				para(inteiro j=0;j<4;j++){
					se(codCompra == loja[i][0]){
						se(qtdCompra > tp.cadeia_para_real(loja[i][3])){
							escreva ("\nNão possui estoque sufuciente. ")
						}
						senao{
							loja[i][4] = tp.real_para_cadeia(tp.cadeia_para_real(loja[i][4])+qtdCompra)
							loja[i][3] = tp.real_para_cadeia(tp.cadeia_para_real(loja[i][3])-qtdCompra)
							valorCompra = tp.cadeia_para_real(loja[i][3])*qtdCompra
							totalCompra+=valorCompra
							
						}
					}
				}
			}

			escreva("\ndeseja continuar comprando? (S/N) ")
			leia(confirmaCompra)
			confirmaCompra = tx.caixa_alta(confirmaCompra)
			se(confirmaCompra == "N"){
				pare
			}
			}enquanto(loop)

			dadosLoja()
			escreva("\nValor total da compra: ", totalCompra)
			imposto = totalCompra*0.09
			escreva("Terá ", imposto, " em imposto sobre a compra \n")
			descontoAVista = totalCompra*0.10

			
		}
				
	}

}
			
			

			

							
						
			
			
			
			
			/*para (inteiro l=0; l<10; l++){
				para (inteiro c=0;c<4; c++){
					se (codCompra == loja[l][c]){
						escreva(
							loja[l][0],"\t",
							loja[l][1],"\t",
							loja[l][2],"\t",
							loja[l][3],"\n")
					
						escreva ("\nProduto Selecionado: " + loja[l][1])
						escreva ("Quantidade: " + qtdCompra)
						totalCompra = tp.cadeia_para_real(loja[l][2]) * qtdCompra
						escreva ("\nPreço total da compra: R$" + mat.arredondar(totalCompra,2))
						escreva("Você confirma (S/N): ")
						leia (confirma)
						confirma = tx.caixa_alta(confirma)

						se (confirma == "S"){
							loja[l][4] = tp.real_para_cadeia(tp.cadeia_para_real(loja[l][4])+qtdCompra)

						}
					}
				}
			}*/

	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */