// lista 1 atv 07
programa
{

inclua biblioteca Matematica --> mat

	funcao inicio()
	{

		real a, b, c, d, E, f, x, y
		escreva("digite o valor de a: ")
		leia(a)
		escreva("digite o valor de b: ")
		leia(b)
		escreva("digite o valor de c: ")
		leia(c)
		escreva("digite o valor de d: ")
		leia(d)
		escreva("digite o valor de e: ")
		leia(E)
		escreva("digite o valor de f: ")
		leia(f)

		
		x = mat.arredondar(((c*E)-(b*f))/((a*E)-(b*d)), 2)
		y = mat.arredondar(((a*f)-(c*d))/((a*E)-(b-d)), 2)

		
		escreva("valor de x: " + x +", valor de y: " + y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */