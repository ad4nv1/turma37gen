package Lista8;

import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];

		
		
		
		System.out.println("digite valores para a matriz N1: \n");
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				System.out.println("digite um valor para a linha "+ i+ " e coluna "+ j+ ": ");
					N1[i][j] = sc.nextInt();
				}
		}
		
		
		
		
		
		System.out.println("----------------------------- \n");
		System.out.println("digite valores para a matriz N2: \n");
		
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				System.out.println("digite um valor para a linha "+ i+ " e coluna "+ j+ ": ");
					N2[i][j] = sc.nextInt();
				}
		}
		
		
		
		
		
		
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				M1[i][j] = N1[i][j] + N2[i][j];
				}
		}
		
		
	
		
		
		
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				M2[i][j] = N1[i][j] - N2[i][j];
				}
		}
		
		
		
		
		
		System.out.println("matriz gerada da soma: \n");
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				System.out.print( M1[i][j] +"-");
				}
			System.out.println("");
		}
		
		System.out.println("matriz gerada da subtração: \n");
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				System.out.print(M2[i][j]+"-");
				}
			System.out.println("");
		}
			
		sc.close();

	}
	/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	 * 
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/

}
