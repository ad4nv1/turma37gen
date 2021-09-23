programa
{
	
inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		cadeia nome
		real fire, calCel
		escreva("digite seu nome: ")
		leia(nome)
		escreva("digite a temperatura: ")
		leia(fire)
	
		calCel = mat.arredondar((fire-32)/1.8, 0)
		escreva("opa ",nome,"a temperatura em celcios é: ", calCel)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */