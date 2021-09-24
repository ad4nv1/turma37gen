//Lista-02-atv-03
programa
{
	
	funcao inicio()
	{
		real valor1, valor2, valor3, valor4, quadrado1, quadrado2, quadrado3, quadrado4

		escreva("digite o primeiro valor: ")
		leia(valor1)
		escreva("digite o segundo valor: ")
		leia(valor2)
		escreva("digite o terceiro valor: ")
		leia(valor3)
		escreva("digite o quarto valor: ")
		leia(valor4)

		quadrado1 = valor1*valor1
		quadrado2 = valor2*valor2
		quadrado3 = valor3*valor3
		quadrado4 = valor4*valor4

		se(quadrado3>=1000){
			escreva("Valor do quadrado do terceiro número: " + quadrado3)
			}
		senao{
			escreva("valor 1: " + valor1 + ", seu quadrado: " + quadrado1 + "\n")
			escreva("valor 2: " + valor2 + ", seu quadrado: " + quadrado2 + "\n")
			escreva("valor 3: " + valor3 + ", seu quadrado: " + quadrado3 + "\n")
			escreva("valor 4: " + valor4 + ", seu quadrado: " + quadrado4)
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