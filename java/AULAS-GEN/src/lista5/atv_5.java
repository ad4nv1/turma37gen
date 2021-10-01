package lista5;

import java.util.Scanner;

public class atv_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float nota1, nota2, nota3, media;

		System.out.println("digite a primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.println("digite a segunda nota: ");
		nota2 = sc.nextFloat();
		System.out.println("digite a terceira nota: ");
		nota3 = sc.nextFloat();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

		System.out.println(media);

		sc.close();

	}

}
