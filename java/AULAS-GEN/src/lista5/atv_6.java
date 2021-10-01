package lista5;

import java.util.Scanner;

public class atv_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, d;

		System.out.println("digite o ponto x1: ");
		x1 = sc.nextFloat();
		System.out.println("digite o ponto x2: ");
		x2 = sc.nextFloat();
		System.out.println("digite o ponto y1: ");
		y1 = sc.nextFloat();
		System.out.println("digite o ponto y2: ");
		y2 = sc.nextFloat();

		d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

		System.out.println(String.format("%.2f", Math.sqrt(d)));
		sc.close();

	}

}
