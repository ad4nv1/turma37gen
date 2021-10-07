package Lista8;

import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero[] = new double[5], maior=0;
				for(int i=0; i<5;i++){
					System.out.println("digite um valor: ");
					numero[i] = sc.nextDouble();
					if(maior<numero[i]){
						maior = numero[i];
					}
				}
				for(int i=0; i<5;i++){
					System.out.println(numero[i] +"\n");
					}
				System.out.println("o maior número é: " + maior);
		sc.close();

	}

}
