package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<>();
		int op;
		
		System.out.println("BANCO DEV-G1");
		System.out.println("BANCO DEV - Para você que estar DEVendo!");
		
		
		while(true) {
			System.out.println("1 - CONTA POUPANÇA");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("6 - SAIR");
			op = sc.nextInt();
			while(true) {
				if(op == 1 || op == 2 || op == 3 || op == 4 || op == 5 || op == 6) {
					break;
				}else {
					System.out.println("Opção inválida. Digite um dos números: ");
					System.out.println("1 - CONTA POUPANÇA");
					System.out.println("2 - CONTA CORRENTE");
					System.out.println("3 - CONTA ESPECIAL");
					System.out.println("4 - CONTA EMPRESA");
					System.out.println("6 - SAIR");
					 op = sc.nextInt();
				}
			}
			if(op == 1) {
				System.out.println("em manutenção");
			}
			else if(op == 2) {
				for(int i=1; i<=10;i++) {
					System.out.println("CONTA CORRENTE, MOVIMENTO #"+i);
					System.out.println("Numero da conta: ");
					int numeroConta = sc.nextInt();
					System.out.println("Cpf do titular: ");
					String cpf = sc.next();
					Conta conta = new ContaCorrente(numeroConta, cpf);
					System.out.println("você possui "+ conta.getSaldo());
					System.out.println("Qual movimentação deseja realizar: D-debito C-credito");
					char opMov = sc.next().toUpperCase().charAt(0);
					
					
				}
			}
			
		}
		
		
	

	}

}
