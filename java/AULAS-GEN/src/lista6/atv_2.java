package lista6;

import java.util.Scanner;

public class atv_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n;
		System.out.println("digite o numero 1: ");
		n1= sc.nextInt();
		System.out.println("digite o numero 2: ");
		n2= sc.nextInt();
		System.out.println("digite o numero 3: ");
		n3= sc.nextInt();
		
		if(n1>n2) {
			n=n1;
			n1=n2;
			n2=n;
		}
		if(n2>n3) {
			n = n2;
			n2=n3;
			n3=n;
		}
		if(n1>n2) {
			n = n1;
			n1=n2;
			n2=n;
		}
		System.out.println("ordem: "+ n1 + " " + n2 + " " +n3);
		sc.close();

	}
/*2- Faça um programa que entre com três números 
 e coloque em ordem crescente. */
	
}
