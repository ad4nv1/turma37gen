//Lista-04-atv-03
programa
{
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		
		escreva("digite valores para a matriz N1: \n")


		
		para(inteiro i=0;i<4;i++){
			para(inteiro j=0;j<6;j++){
				escreva("digite um valor para a linha ", i, " e coluna ", j, ": ")
				leia(N1[i][j])
				}
		}
		escreva("----------------------------- \n")
		escreva("digite valores para a matriz N2: \n")
		para(inteiro i=0;i<4;i++){
			para(inteiro j=0;j<6;j++){
				escreva("digite um valor para a linha ", i, " e coluna ", j, ": ")
				leia(N2[i][j])
				}
		}
		para(inteiro i=0;i<4;i++){
			para(inteiro j=0;j<6;j++){
				M1[i][j] = N1[i][j] + N2[i][j]
				}
		}
		para(inteiro i=0;i<4;i++){
			para(inteiro j=0;j<6;j++){
				M2[i][j] = N1[i][j] - N2[i][j]
				}
		}
		escreva("matriz gerada da soma: \n")
		para(inteiro i=0;i<4;i++){
			para(inteiro j=0;j<6;j++){
				escreva("Matriz M1 linha ", i, " e coluna ", j, ": ", M1[i][j], "\n")
				}
		}
		
		escreva("matriz gerada da subtração: \n")
		para(inteiro i=0;i<4;i++){
			para(inteiro j=0;j<6;j++){
				escreva("Matriz M2 linha ", i, " e coluna ", j, ": ", M2[i][j], "\n")
				}
		}
	}
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
1- ler N1
2- ler N2
3- criar matriz M1(resultante da soma)
4- 3- criar matriz M2(resultante da diferença)
*/
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 7, 10, 2}-{N2, 7, 20, 2}-{M1, 7, 30, 2}-{M2, 7, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */