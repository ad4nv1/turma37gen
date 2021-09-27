//lista-03-atv-03
programa
{
	
	funcao inicio()
	{	
		inteiro finalizar=0, numeros=0, contador=0
		real totalNumeros=0.0
		enquanto(numeros >= 0){
			escreva("escreva um valor (negativo sai): ")
			leia(numeros)
			totalNumeros+=numeros
			contador++
			
		}
		escreva("o total dos valores é: " + (totalNumeros+(numeros*-1) + "\n"))
		escreva("a media dos valores é: " + ((totalNumeros+(numeros*-1))/(contador-1))+ "\n")
		escreva("foram digitados " + (contador -1) + " valores \n")
		
	}
	/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
01-total do somatório ok
02-a média ok
03-total de valores lidos ok*/
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