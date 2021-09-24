//Lista-02-atv-04
programa
{
	
	funcao inicio()
	{
		
		inteiro numero
		
		escreva("digite um valor: ")
		leia(numero)
		
		se(numero<0 e (numero%2)==0){
		escreva("este numero é par e negativo")
		}
		senao se((numero%2)==0 e numero> 0){
			escreva("este numero é par e positivo")
		}
		senao se((numero%2)!=0 e numero<0){
			escreva("este numero é impar e negativo")
		}
		senao{
			escreva("este numero é impar e positivo")
		}
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */