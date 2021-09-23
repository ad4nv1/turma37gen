// lista 1 atv 01
programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, soma
		
		escreva("diga quantos anos você tem: ")
		leia(anos)
		escreva("diga quantos meses você tem: ")
		leia(meses)
		escreva("diga quantos dias você tem: ")
		leia(dias)
		
		soma = (anos*365)+(meses*30)+dias
		escreva(soma + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 142; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */