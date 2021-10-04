package lista6;

import java.util.Scanner;

public class atv_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua idade: ");
		idade =  sc.nextInt();
		
		if(idade >=10 && idade<=14) {
			System.out.println("Sua categoria é infantil");
			
		}else if(idade >=15 && idade<=17) {
			System.out.println("Sua categoria é Juvenil");
		}else if(idade >=18 && idade<=25) {
			System.out.println("Sua categoria é adulto");
		}else {
			System.out.println("não temos categoria para você");
		}
		
		
		sc.close();

	}

}
