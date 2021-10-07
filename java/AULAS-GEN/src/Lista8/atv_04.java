package Lista8;

import java.util.Scanner;

public class atv_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int X[][] = new int[3][3];
		
		
		int soma=0, somaPrincipal=0;
		
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						System.out.println("digite um valor para a linha "+ i+ " e coluna "+ j+ ": ");
						X[i][j] = sc.nextInt();
						soma+=X[i][j];
						if(i==j){
							somaPrincipal+=X[i][j];
						}
					}
				}
		System.out.println("a soma dos valores da diagonal principal é: "+ somaPrincipal+ "\n");
		System.out.println("a soma dos valores da matriz é: "+ soma+ "\n");
		sc.close();
		

	}
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.


*/


}
