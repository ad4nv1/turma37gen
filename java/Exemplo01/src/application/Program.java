package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int numero, opConta, opMovimentacao;
		String cpf;
		boolean ativo;
		double saque, deposito;

		System.out.println("digite o numero da conta: ");
		numero = sc.nextInt();

		sc.nextLine();
		System.out.println("digite o seu cpf: ");
		cpf = sc.nextLine();

		System.out.println("A conta: 1-ativada 2-desativada ");
		opConta = sc.nextInt();
		
		while(true) {
			
			if(opConta == 1 || opConta == 2 ) {
				break;
			}else {
				System.out.println("escolha uma opcão: 1-ativada 2-desativada ");
				opConta = sc.nextInt();
			}
		}

		if (opConta == 1) {
			ativo = true;
		} else {
			ativo = false;
		}
		
		Conta conta = new Conta(numero, cpf, ativo);
		
		System.out.println("Você tem " + conta.getSaldo());
		System.out.println("Você pretende: 1-sacar 2-depositar ");
		opMovimentacao = sc.nextInt();
		while(true) {
			
			if(opMovimentacao == 1 || opMovimentacao == 2 ) {
				break;
			}else {
				System.out.println("escolha uma opcão: 1-sacar 2-depositar ");
				opMovimentacao = sc.nextInt();
			}
		}

		
		
		
		if (opMovimentacao == 1) {
			System.out.println("Quanto você deseja sacar: ");
			saque = sc.nextDouble();

			System.out.println("Novo saldo é: " + conta.sacar(saque));

		} else {
			System.out.println("Quanto você deseja depositar: ");
			deposito = sc.nextDouble();

			System.out.println("Novo saldo é: " + conta.deposito(deposito));
		}
		
		

		
		
		System.out.println(conta.toString());
		
		
		sc.close();

	}

}
