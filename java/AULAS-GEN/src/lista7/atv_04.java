package lista7;

import java.util.Scanner;

public class atv_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, sexo, temperamento, 
		contadorPessoasCalmas=0,
		contadorMulheresNervosas=0,
		contadorHomensAgressiovos=0,
		contadorOutrosCalmos=0,
		contadorMais40=0,
		contadorMenos18=0,
		contadorPessoas=0;
		boolean y = true;
		
		
		
		
		while(y) {
			if(contadorPessoas > 4) {
				break;
			}
			contadorPessoas++;
			
			
			System.out.println("qual a idade da pessoa numero "+ contadorPessoas+": ");
			idade = sc.nextInt();
			if(idade<0) {
				contadorPessoas--;
				continue;
			}
			
			
			
			System.out.println("escolha uma das opções: ");
			System.out.println("1-feminino");
			System.out.println("2-masculino");
			System.out.println("3-outros");
			sexo = sc.nextInt();
			
			while(y) {
				if(sexo == 1 || sexo == 2 || sexo == 3) {
					break;
				
				}else {
					System.out.println("invalido, digite uma das opções: ");
					System.out.println("1-feminino");
					System.out.println("2-masculino");
					System.out.println("3-outros");
					sexo = sc.nextInt();
					
				}	
			}

			
			
			
			System.out.println("Você se considera uma: ");
			System.out.println("1- pessoa calma");
			System.out.println("2- pessoa nervosa");
			System.out.println("3- pessoa agressiva");
			temperamento = sc.nextInt();
			
			while(y) {
				if(temperamento == 1 || temperamento == 2 || temperamento == 3) {
					break;
				
				}else {
					System.out.println("invalido, digite uma das opções: ");
					System.out.println("1- pessoa calma");
					System.out.println("2- pessoa nervosa");
					System.out.println("3- pessoa agressiva");
					temperamento = sc.nextInt();
					
				}	
			}
			
			
			
			
			
			
			
			if(temperamento == 1) {
				contadorPessoasCalmas++;
			}
			if(sexo == 1 && temperamento == 2) {
				contadorMulheresNervosas++;
			}
			if(sexo == 2 && temperamento == 3) {
				contadorHomensAgressiovos++;
			}
			if(sexo == 3 && temperamento == 1) {
				contadorOutrosCalmos++;
			}
			if(idade > 40 && temperamento == 2) {
				contadorMais40++;
			}
			if(idade < 18 && temperamento == 1) {
				contadorMenos18++;
			}
	
		}
		
		
		
		
		
		
		System.out.println(contadorPessoasCalmas+ " pessoas calmas");
		System.out.println(contadorMulheresNervosas+ " mulheres nervosas");
		System.out.println(contadorHomensAgressiovos+ " homens agressivos");
		System.out.println(contadorOutrosCalmos+ " pessoas que declararam outros e são calmas");
		System.out.println(contadorMais40+" pessoas com mais de 40 anos e são nervosas");
		System.out.println(contadorMenos18+" pessoas com menos de 18 e são calmas");
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
	/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o número de pessoas calmas;
- o número de mulheres nervosas;
- o número de homens agressivos;
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos.*/
}
