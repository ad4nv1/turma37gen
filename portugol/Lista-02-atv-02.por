//Lista-02-atv-02
programa
{
	
	funcao inicio()
	{
		inteiro C
		real N, E, valorTotal, valorBase

		escreva("digite o código: ")
		leia(C)
		escreva("digite as horas trabalhadas: ")
		leia(N)

		se(N>50){
			E = (N - 50)*20
			valorBase = 50.00*10.00
			valorTotal = E + valorBase
			escreva("funcionário código: " + C + "\n")
			escreva("Salário total: " + valorTotal + "\n")
			escreva("Salário excedente: " + E)
			}
		senao{
			E = 0.0
			valorBase = N*10
			valorTotal = E + valorBase
			escreva("funcionário código: " + C + "\n")
			escreva("Salário total: " + valorTotal + "\n")
			escreva("Salário excedente: " + E)
			}
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */