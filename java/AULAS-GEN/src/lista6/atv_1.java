package lista6;

import java.util.Scanner;

public class atv_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, maior=0;
		
		for(int i=0;i<3; i++) {
			System.out.println("digite o valor " + (i+1)+ ": ");
			n = sc.nextInt();
			if(maior<n) {
				maior = n;
			}
		}
		System.out.println("o maior valor � " + maior);
		
		sc.close();
	}
/*1- Fa�a um programa que receba tr�s 
	inteiros e diga qual deles � o maior.*/
}
