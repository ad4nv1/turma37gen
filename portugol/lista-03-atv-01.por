//lista-03-atv-01
programa
{
	
	funcao inicio()
	{
		inteiro quantidadeHabitantes=0, salario=0,  quantidadeFilhos=0, maiorSalario=0 
		real percentual=0.0, totalSalario=0.0, totalFilhos=0.0
		escreva("quantas pessoas participarão da pesquisa: ")
		leia(quantidadeHabitantes)

		para( inteiro i=1; i<=quantidadeHabitantes; i++){
			escreva("qual o salário do cidadão " + i +": ")
			leia(salario)
			
			totalSalario += salario // totalSalario = totalSalario+salario
		
			escreva("quantos filhos tem o cidadão " + i +": ")
			leia(quantidadeFilhos)
			
			totalFilhos += quantidadeFilhos  // totalFilhos = totalFilhos + quantidadeFilhos
			           
			se(salario > maiorSalario){
				maiorSalario = salario
			}
			se(salario<=100){
				percentual++ // percentual = percentual + 1 -> percentual = 1 
			}	
		}

		escreva("A média salarial da população é: " + (totalSalario/quantidadeHabitantes)+"\n")
		escreva("A média de filhos da população é: " + (totalFilhos/quantidadeHabitantes)+"\n")
		escreva("o maior salário é: "+ maiorSalario+"\n")
		escreva("quantidade de pessoas que ganham até 100R$ é de "+ ((percentual*100)/quantidadeHabitantes)+"%\n")
		
	}
	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população; okok
b) média do número de filhos; okok
c) maior salário; okok
d) percentual de pessoas com salário até R$100,00.okok*/
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */