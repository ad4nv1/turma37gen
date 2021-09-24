//Lista-02-atv-05
programa
{
	
	funcao inicio()
	{
		real indice
		escreva("digite o indice de poluição: ")
		leia(indice)

		se(indice<0.25){
			escreva("indice aceitável")
		}
		senao se (indice>0.25 e indice<=0.3){
			escreva("as empresas do grupo 1 devem ser intimada!")
		}
		senao se(indice>0.3 e indice<=0.4){
			escreva("as empresas dos grupos 1 e 2 devem ser intimadas")
		}
		senao{
			escreva("Todos os 3 grupos deverão ser intimados")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */