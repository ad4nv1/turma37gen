package lista7;

import java.util.Scanner;

public class atv_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero, totalNumero=0;
		
		
		do {
			System.out.println("digite um numero: (0 sai)");
			numero = sc.nextInt();
	
			totalNumero = totalNumero + numero; 
			
		}while(numero!=0);
		
		System.out.println("total dos valores: "+totalNumero);
		
		sc.close();

	}
	/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

}
