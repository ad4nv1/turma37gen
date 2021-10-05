package lista7;

import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador21=0, contador50=0, idade, contadorPessoa=0;
		boolean y=true;
		
		while(y) {
			contadorPessoa++;
			System.out.print("Digite a idade da pessoa numero "+contadorPessoa+" (-99 sai): ");
			idade = sc.nextInt();
			if(idade == -99) {
				break;
			}
			else if(idade>0 && idade<21) {
				contador21++;
			}
			else if(idade>50) {
				contador50++;
			}else if(idade<0){
				System.out.println("não é permitido números negativos!!");
				contadorPessoa--;
			}
		}
		System.out.println(contador21+ " pessoas tem menos de 21 anos");
		System.out.println(contador50+ " pessoas tem mais de 50 anos");
		sc.close();

	}
	/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)*/
}
