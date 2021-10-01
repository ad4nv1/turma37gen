package lista5;

import java.util.Scanner;

public class atv_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float a, b, c, d, E, f, x, y;
		System.out.println("digite o valor de a: ");
		a = sc.nextFloat();
		System.out.println("digite o valor de b: ");
		b = sc.nextFloat();
		System.out.println("digite o valor de c: ");
		c = sc.nextFloat();
		System.out.println("digite o valor de d: ");
		d = sc.nextFloat();
		System.out.println("digite o valor de e: ");
		E = sc.nextFloat();
		System.out.println("digite o valor de f: ");
		f = sc.nextFloat();

		x = (c * E) - (b * f) / (a * E) - (b * d);
		y = (a * f) - (c * d) / (a * E) - (b - d);

		System.out.println("valor de x: " + x + ", valor de y: " + y);
		sc.close();

	}

}
