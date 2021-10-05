package lista7;

import java.util.Scanner;

public class atv_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contadorPares = 0, contadorImpares = 0,contadorZero = 0, numero;
		
		for(int i=0;i<10;i++){
			System.out.println("digite o numero "+(i+1)+": ");
			numero = sc.nextInt();
			if((numero%2) ==0 && numero>0) {
				contadorPares++;
			}else if((numero%2)!=0){
				contadorImpares++;
			}else {
				contadorZero++;
			}
		}
		
		System.out.println("Você digitou "+contadorPares+" numeros pares");
		System.out.println("Você digitou "+contadorImpares+" numeros impares");
		System.out.println("Você digitou "+contadorZero+" vezes o 0");
		
		sc.close();
		
		
	}
	/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
}

