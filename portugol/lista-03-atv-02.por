//lista-03-atv-02
programa
{
	
	funcao inicio()
	{
		inteiro impar=0, somaImpares=0
		para(inteiro i = 1; i<=500;i++){
			se((i%3)==0){
			//se((i%3)==0 e (i%2)!=0){
				somaImpares+=i
			}
		}
		escreva("a soma de todos os multipos de 3 é: " + somaImpares)
	}
	/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 30; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */