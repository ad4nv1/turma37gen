// lista 1 atv 08
programa
{
	
	funcao inicio()
	{
		real custoFabrica, pDistribuidor, pImpostos, custoFinal
		escreva("escreva o valor de fábrica: ")
		leia(custoFabrica)
		pDistribuidor = (custoFabrica*0.28)
		pImpostos = (custoFabrica*0.45)
		custoFinal = custoFabrica + pDistribuidor + pImpostos
		escreva("O valor final ficará por: "+ custoFinal)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */