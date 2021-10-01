package lista5;

import java.util.Scanner;

public class atv_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, R, S, D;

		System.out.println("digite o primeiro valor: ");
		A = sc.nextInt();
		System.out.println("digite o segundo valor: ");
		B = sc.nextInt();
		System.out.println("digite o terceiro valor: ");
		C = sc.nextInt();

		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) / 2;

		System.out.println(D);

		sc.close();

	}

}
