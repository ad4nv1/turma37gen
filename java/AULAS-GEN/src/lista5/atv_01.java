package lista5;

import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anos, meses, dias, soma;

		System.out.println("diga quantos anos voc� tem: ");
		anos = sc.nextInt();
		System.out.println("diga quantos meses voc� tem: ");
		meses = sc.nextInt();
		System.out.println("diga quantos dias voc� tem: ");
		dias = sc.nextInt();

		soma = (anos * 365) + (meses * 30) + dias;
		System.out.println(soma + " dias");

		sc.close();

	}

}