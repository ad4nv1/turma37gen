package lista5;

import java.util.Scanner;

public class atv_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double custoFabrica, pDistribuidor, pImpostos, custoFinal;

		System.out.println("escreva o valor de fábrica: ");
		custoFabrica = sc.nextDouble();

		pDistribuidor = custoFabrica * 0.28;
		pImpostos = custoFabrica * 0.45;
		custoFinal = custoFabrica + pDistribuidor + pImpostos;

		System.out.println("O valor final ficará por: " + custoFinal);
		sc.close();

	}

}
