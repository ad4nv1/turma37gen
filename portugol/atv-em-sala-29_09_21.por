programa
{
	
	funcao inicio()
	{
		inteiro numero=1000, contador=0, unidade, dezena, centena, milhar, soma, digito
		escreva("escreva um digito entre 6 e 9: ")
		leia(digito)
		
		para(inteiro i = 0; i<10000;i++){
			contador++
			numero = numero + contador
			unidade = (numero/1)%10
			dezena = (numero/10)%10
			centena = (numero/100)%10
			milhar = (numero/1000)%10
			soma = unidade + dezena + centena + milhar 
			se(unidade<=digito e dezena<=digito e centena<=digito e milhar<=digito e soma==21){
				escreva("\n", unidade, dezena, centena, milhar)
			}
			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */