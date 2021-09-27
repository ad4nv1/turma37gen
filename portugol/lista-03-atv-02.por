//lista-03-atv-02
programa
{
	
	funcao inicio()
	{
	
		inteiro somaImpares = 0
		//(inteiro i = 1; i<=500;i++) = iniciar variavel; parametro; i = i + 1 (i++) 
		para(inteiro i = 1; i<=500;i++){
			se((i%3)==0 e (i%2)!=0){
				somaImpares+=i
				escreva(i + "\n")
			}
		}
		escreva("a soma de todos os multipos de 3 entre 1 e 500 é: " + somaImpares)
	}
	/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */