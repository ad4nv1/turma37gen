package lista6;

import java.util.Scanner;

public class atv_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		System.out.println("Digite um valor: ");
		numero = sc.nextDouble();
		if((numero%2) == 0) {
			System.out.println("o valor � par e sua rais � "+ Math.sqrt(numero));
		}else {
			System.out.println("o valor � impar e "+ (numero*numero)+ " � seu valor ao quadrado");

		}
		
		
		sc.close();

	}

}
