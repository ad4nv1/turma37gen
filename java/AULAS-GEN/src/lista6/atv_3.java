package lista6;

import java.util.Scanner;

public class atv_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua idade: ");
		idade =  sc.nextInt();
		
		if(idade >=10 && idade<=14) {
			System.out.println("Sua categoria � infantil");
			
		}else if(idade >=15 && idade<=17) {
			System.out.println("Sua categoria � Juvenil");
		}else if(idade >=18 && idade<=25) {
			System.out.println("Sua categoria � adulto");
		}else {
			System.out.println("n�o temos categoria para voc�");
		}
		
		
		sc.close();

	}

}
