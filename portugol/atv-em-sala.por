
programa
{	
	funcao inicio()
	{
		
		inteiro numero
		cadeia letra 

		faca {
		escreva("digite um valor: ")
		leia(numero)
		se(numero<0){
		escreva("valor negativo não pode \n")
		}
		senao se((numero%2)==0 ou numero != 0){
			escreva("valor é par \n")
		}
		senao se((numero%2)!=0 ){
			escreva("valor é impar \n")
		}
		senao{
			escreva("valor é neutro \n")
		}
		escreva("digite s para continuar ou n para sair: \n")
		leia(letra)
	
		}enquanto(letra != "n")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 216; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */