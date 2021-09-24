// lista 1 atv 06
programa
{

inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		
		real x1, y1, x2, y2
		real d
		
		escreva("digite o ponto x1: ")
		leia(x1)
		escreva("digite o ponto x2: ")
		leia(x2)
		escreva("digite o ponto y1: ")
		leia(y1)
		escreva("digite o ponto y2: ")
		leia(y2)	

		//d = mat.arredondar(mat.raiz(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)), 2), 2)
		
   		d = mat.arredondar(mat.raiz(mat.potencia((x2-x1), 2) + mat.potencia((y2-y1), 2), 2), 2)

		

		escreva(d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */