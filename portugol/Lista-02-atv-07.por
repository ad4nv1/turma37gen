//Lista-02-atv-07
programa
{
	
	funcao inicio()
	{
		real base, altura, area
		escreva("digite o valor da base: ")
		leia(base)
		escreva("digite o valor da altura: ")
		leia(altura)

		se(base > 0 e altura > 0){
			area = (base*altura)/2
			escreva("o valor da área é: " + area)
		}senao se(base<=0){
			escreva("valor da base inválido")
		}senao{
			escreva("valor da altura inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */