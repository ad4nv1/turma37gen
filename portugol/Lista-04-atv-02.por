//Lista-04-atv-02
programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro soma=0, jogadas[10], maior=0, contador=0, totalJogadas=0
		para(inteiro i=0; i<10;i++){
			jogadas[i] = Util.sorteia(1, 6)
			totalJogadas+=jogadas[i]
			se(maior<jogadas[i]){
				maior = jogadas[i]
			}
		}
		para(inteiro i=0; i<10;i++){
			escreva("JOGADA " + (i+1) + ": " + jogadas[i] + "\n")
			se(jogadas[i]==maior){
				contador++ // contador = 0 + 1 
			}
		}
		
		escreva("a média aritmética das jogadas foi: " + (totalJogadas/10) + "\n")
		escreva("a maior pontuação foi: " + maior + " e ela apareceu " + contador + " vezes\n")
	}
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */