package lista5;

import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;
		int anos, meses, dias;

		System.out.println("digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("quantos dias você tem: ");
		dias = sc.nextInt();
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;

		System.out.println(nome + " Você tem: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

		sc.close();

	}

}
