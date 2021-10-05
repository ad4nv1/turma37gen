package lista7;

import java.util.Scanner;

public class atv_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0, contador=0, numero;
		double resultado;
		do {
			System.out.println("digite um valor: (0 sai) ");
			numero = sc.nextInt();
			if((numero%3)==0 && numero!=0) {
				total+=numero;
				contador++;
			}
			
		}while(numero!=0);
		resultado = total/contador;
		System.out.println("a media da soma dos multiplos de 3 é "+resultado);
		sc.close();

	}
	/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

}
