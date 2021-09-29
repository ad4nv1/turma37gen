//Lista-04-atv-01
programa
{
	
	funcao inicio()
	{
		real numero[5], maior=0
		para(inteiro i=0; i<5;i++){
			escreva("digite um valor: ")
			leia(numero[i])
			se(maior<numero[i]){
				maior = numero[i]
			}
		}
		para(inteiro i=0; i<5;i++){
			escreva(numero[i] +"\n")
			}
		escreva("o maior número é: " + maior)
	}
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
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