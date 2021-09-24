// Lista-02-atv-01
programa
{
	
	funcao inicio()
	{
		real P, E, M

		escreva("digite o peso: ")
		leia(P)

		se(P>50){
			E = P - 50
			M = E*4
			escreva("Excesso de peso: " + E + "\n")
			escreva("Multa a pagar: " + M)
		}
		senao{
			E = 0
			M = 0
			escreva("Excesso de peso: " + E + "\n")
			escreva("Multa a pagar: " + M)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */