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
		
		System.out.println("Voc� digitou "+contadorPares+" numeros pares");
		System.out.println("Voc� digitou "+contadorImpares+" numeros impares");
		System.out.println("Voc� digitou "+contadorZero+" vezes o 0");
		
		sc.close();
		
		
	}
	/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
}

