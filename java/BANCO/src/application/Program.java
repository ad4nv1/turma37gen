package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<>();
		
		int op, numeroConta = 0, ano = 0;
		String cpf = "";
		double quantidadeSaque, quantidadeDeposito;

		System.out.println("BANCO DEV-G1");
		System.out.println("BANCO DEV - Para você que está DEVendo!");

		while (true) {
			System.out.println("1 - CONTA POUPANÇA");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA Estudantil");
			System.out.println("6 - SAIR");
			op = sc.nextInt();
			while (true) {
				if (op == 1 || op == 2 || op == 3 || op == 4 || op == 5 || op == 6) {
					break;
				} else {
					System.out.println("Opção inválida. Digite um dos números: ");
					System.out.println("1 - CONTA POUPANÇA");
					System.out.println("2 - CONTA CORRENTE");
					System.out.println("3 - CONTA ESPECIAL");
					System.out.println("4 - CONTA EMPRESA");
					System.out.println("5 - CONTA Estudantil");
					System.out.println("6 - SAIR");
					op = sc.nextInt();
				}
			}

			// =============================conta poupanca ================================

			if (op == 1) {
				
				System.out.println("Numero da conta: ");
				numeroConta = sc.nextInt();
				System.out.println("Cpf do titular: ");
				cpf = sc.next();
				System.out.println("Ano de criação da conta: ");
				ano = sc.nextInt();
				ContaPoupanca conta = new ContaPoupanca(numeroConta, cpf, ano);

				System.out.println("você possui " + conta.getSaldo());

				for (int i = 1; i <= 10; i++) {
					System.out.println("CONTA POUPANCA, MOVIMENTO #" + i);
					System.out.println("Qual movimentação deseja realizar: D-debito C-credito");
					char opMov = sc.next().toUpperCase().charAt(0);
					while(true) {
						if(opMov == 'C' || opMov == 'D') {
							break;
						}
						else {
							System.out.println("Opção inválida!!");
							System.out.println("Qual movimentação deseja realizar: D-debito C-credito");
							opMov = sc.next().toUpperCase().charAt(0);
						}
					}
					while (true) {
						if (opMov == 'D' && conta.getSaldo() == 0) {
							System.out.println("você não possui dinheiro na conta, apenas será possível depositar, digite: C-credito");
							opMov = sc.next().toUpperCase().charAt(0);
						} else  {
							break;

						}
					}
					if (opMov == 'D') {
						System.out.println("quanto deseja sacar: ");
						quantidadeSaque = sc.nextDouble();
						while (true) {
							if (quantidadeSaque > conta.getSaldo()) {
								System.out.println(
										"quantidade excede o valor, digite um valor abaixo de " + conta.getSaldo());
									quantidadeSaque = sc.nextDouble();
							} else {
								break;
							}
							
						}
						conta.debito(quantidadeSaque);

					} else if (opMov == 'C') {
						System.out.println("quanto deseja depositar: ");
						quantidadeDeposito = sc.nextDouble();
						conta.credito(quantidadeDeposito);

					}
					System.out.println("quer fazer outra transação? S/N");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if(opContinuar == 'N') {
						break;
					}
				}
				
				conta.correcao();
				list.add(conta);
				System.out.println(conta.getSaldo());
			}

			// ======================================conta corrente

			else if (op == 2) {
				

				System.out.println("Numero da conta: ");
				numeroConta = sc.nextInt();
				System.out.println("Cpf do titular: ");
				cpf = sc.next();
				ContaCorrente conta = new ContaCorrente(numeroConta, cpf);

				System.out.println("você possui " + conta.getSaldo());

				for (int i = 1; i <= 10; i++) {
					System.out.println("CONTA CORRENTE, MOVIMENTO #" + i);
					System.out.println("Qual movimentação deseja realizar: D-debito C-credito");
					char opMov = sc.next().toUpperCase().charAt(0);
					while(true) {
						if(opMov == 'C' || opMov == 'D') {
							break;
						}
						else {
							System.out.println("Opção inválida!!");
							System.out.println("Qual movimentação deseja realizar: D-debito C-credito");
							opMov = sc.next().toUpperCase().charAt(0);
						}
					}
					while (true) {
						if (opMov == 'D' && conta.getSaldo() == 0) {
							System.out.println("você não possui dinheiro na conta, apenas será possível depositar, digite: C-credito");
							opMov = sc.next().toUpperCase().charAt(0);
						} else {
							break;

						}
					}
					if (opMov == 'D') {
						System.out.println("quanto deseja sacar: ");
						quantidadeSaque = sc.nextDouble();
						while (true) {
							if (quantidadeSaque > conta.getSaldo()) {
								System.out.println(
										"quantidade excede o valor, digite um valor abaixo de " + conta.getSaldo());
								quantidadeSaque = sc.nextDouble();
							} else {
								break;
							}
						}
						conta.debito(quantidadeSaque);

					} else if (opMov == 'C') {
						System.out.println("quanto deseja depositar: ");
						quantidadeDeposito = sc.nextDouble();
						conta.credito(quantidadeDeposito);

					}
					System.out.println("quer fazer outra transação? S/N");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if(opContinuar == 'N') {
						break;
					}
				}
				System.out.println("Você quer quantos talões (limite 3)? ");
				int opTalao = sc.nextInt();
				while (true) {
					if (opTalao == 1 || opTalao == 2 || opTalao == 3 || opTalao == 0) {
						break;
					} else {
						System.out.println("limite de 3 taloes: ");
						opTalao = sc.nextInt();

					}
				}
				conta.setcontadorTalao(opTalao);
				conta.pediTalao();
				
				list.add(conta);
			}

			// ==========================conta especial ===================================

			else if (op == 3) {
				

				System.out.println("Numero da conta: ");
				numeroConta = sc.nextInt();
				System.out.println("Cpf do titular: ");
				cpf = sc.next();
				ContaEspecial conta = new ContaEspecial(numeroConta, cpf);

				System.out.println("você possui " + conta.getSaldo());

				for (int i = 1; i <= 10; i++) {
					System.out.println("CONTA ESPECIAL, MOVIMENTO #" + i);
					System.out.println("Qual movimentação deseja realizar: D-debito C-credito L-limite");
					char opMov = sc.next().toUpperCase().charAt(0);
					while(true) {
						if(opMov == 'C' || opMov == 'D' || opMov == 'L') {
							break;
						}
						else {
							System.out.println("Opção inválida!!");
							System.out.println("Qual movimentação deseja realizar: D-debito C-credito L-limite");
							opMov = sc.next().toUpperCase().charAt(0);
						}
					}
					while (true) {
						if (opMov == 'D' && conta.getSaldo() == 0) {
							System.out.println("você não possui dinheiro na conta escolha: C-credito  L-limite");
							opMov = sc.next().toUpperCase().charAt(0);
						} else {
							break;

						}
					}
					if(opMov == 'D') {
						System.out.println("quanto deseja sacar: ");
						quantidadeSaque = sc.nextDouble();
						while (true) {
							if (quantidadeSaque > conta.getSaldo()) {
								System.out.println(
										"quantidade excede o valor, digite um valor abaixo de " + conta.getSaldo());
								quantidadeSaque = sc.nextDouble();
							} else {
								break;
							}
						}
						conta.debito(quantidadeSaque);
					}
					else if(opMov == 'C') {
						System.out.println("quanto deseja depositar: ");
						quantidadeDeposito = sc.nextDouble();
						conta.credito(quantidadeDeposito);
					}
					else if(opMov == 'L') {
						System.out.println("quanto deseja usar: ");
						double opLimite = sc.nextDouble();
						while (true) {
							if (opLimite > conta.getLimite()) {
								System.out.println("escolha um valor inferior a " + conta.getLimite());
								opLimite = sc.nextDouble();
								
							} else {
								break;
							}
						}
						conta.usarLimite(opLimite);
					}
					System.out.println("quer fazer outra transação? S/N");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if(opContinuar == 'N') {
						break;
					}
				}
				list.add(conta);
			}

			// ========================Conta Empresa ===============
			else if (op == 4) {
				
				System.out.println("Numero da conta: ");
				numeroConta = sc.nextInt();
				System.out.println("Cpf do titular: ");
				cpf = sc.next();
				ContaEmpresa conta = new ContaEmpresa(numeroConta, cpf);
				System.out.println("você possui " + conta.getSaldo()+" no saldo");
				System.out.println("você possui " + conta.getEmprestimoEmpresa()+" de limite p/ emprestimo");
				for (int i = 1; i <= 10; i++) {
					System.out.println("CONTA EMPRESA, MOVIMENTO #" + i);
					System.out.println("Qual movimentação deseja realizar: D-debito C-credito E-Emprestimo");
					char opMov = sc.next().toUpperCase().charAt(0);
					while(true) {
						if(opMov == 'C' || opMov == 'D' || opMov == 'E') {
							break;
						}
						else {
							System.out.println("Opção inválida!!");
							System.out.println("Qual movimentação deseja realizar: D-debito C-credito  E-Emprestimo");
							opMov = sc.next().toUpperCase().charAt(0);
						}
					}
					while (true) {
						if (opMov == 'D' && conta.getSaldo() == 0) {
							System.out.println("você não possui dinheiro na conta, escolha:  C-credito E-Emprestimo");
							opMov = sc.next().toUpperCase().charAt(0);
						} else {
							break;

						}
					}
					if (opMov == 'D') {
						System.out.println("quanto deseja sacar? ");
						quantidadeSaque = sc.nextDouble();
						while (true) {
							if (quantidadeSaque > conta.getSaldo()) {
								System.out.println("quantidade excede o valor, digite um valor abaixo de " + conta.getSaldo());
								quantidadeSaque = sc.nextDouble();
							} else {
								break;
							}
						}
					conta.debito(quantidadeSaque);
					}
					else if(opMov == 'C') {
						System.out.println("quanto deseja depositar: ");
						quantidadeDeposito = sc.nextDouble();
						conta.credito(quantidadeDeposito);
						
					}
					else if(opMov == 'E') {
						System.out.println("Você tem "+conta.getEmprestimoEmpresa()+" livres para emprestimo");
						System.out.println("quanto desenja usar desse valor: ");
						double valorEmprestimo = sc.nextDouble();
						while(true) {
							if(valorEmprestimo> conta.getEmprestimoEmpresa()) {
								System.out.println("excede o valor");
								System.out.println("digite umvalor inferior a "+conta.getEmprestimoEmpresa());
								valorEmprestimo = sc.nextDouble();
								
							}else {
								break;
							}
						}
						conta.pedirEmprestimo(valorEmprestimo);
					}
					System.out.println("quer fazer outra transação? S/N");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if(opContinuar == 'N') {
						break;
					}
				}
			
			list.add(conta);
			}
			
			
			
			// ===================================Conta Estudantil ===============
			else if(op == 5) {
				
				System.out.println("Numero da conta: ");
				numeroConta = sc.nextInt();
				System.out.println("Cpf do titular: ");
				cpf = sc.next();
				ContaEstudantil conta = new ContaEstudantil(numeroConta, cpf);

				System.out.println("você possui " + conta.getSaldo()+ " no saldo");
				System.out.println("você possui " + conta.getLimiteEstudanti()+" de limite p/ emprestimo");
				for (int i = 1; i <= 10; i++) {
					System.out.println("CONTA ESTUDANTIL, MOVIMENTO #" + i);
					System.out.println("Qual movimentação deseja realizar: D-debito C-credito E-Emprestimo");
					char opMov = sc.next().toUpperCase().charAt(0);
					while(true) {
						if(opMov == 'C' || opMov == 'D' || opMov == 'E') {
							break;
						}
						else {
							System.out.println("Opção inválida!!");
							System.out.println("Qual movimentação deseja realizar: D-debito C-credito  E-Emprestimo");
							opMov = sc.next().toUpperCase().charAt(0);
						}
					}
					while (true) {
						if (opMov == 'D' && conta.getSaldo() == 0) {
							System.out.println("você não possui dinheiro na conta, escolha:  C-credito E-Emprestimo");
							opMov = sc.next().toUpperCase().charAt(0);
						} else {
							break;

						}
					}
					if (opMov == 'D') {
						System.out.println("quanto deseja sacar? ");
						quantidadeSaque = sc.nextDouble();
						while (true) {
							if (quantidadeSaque > conta.getSaldo()) {
								System.out.println(
										"quantidade excede o valor, digite um valor abaixo de " + conta.getSaldo());
								quantidadeSaque = sc.nextDouble();
							} else {
								break;
							}
						}
					conta.debito(quantidadeSaque);
					}
					else if(opMov == 'C') {
						System.out.println("quanto deseja depositar: ");
						quantidadeDeposito = sc.nextDouble();
						conta.credito(quantidadeDeposito);
						
					}
					else if(opMov == 'E') {
						System.out.println("Você tem "+conta.getLimiteEstudanti()+" livres para emprestimo");
						System.out.println("quanto desenja usar desse emprestimo: ");
						double valorEmprestimo = sc.nextDouble();
						while(true) {
							if(valorEmprestimo> conta.getLimiteEstudanti()) {
								System.out.println("excede o valor");
								System.out.println("digite um valor inferior a "+conta.getLimiteEstudanti()+": ");
								valorEmprestimo = sc.nextDouble();
								
							}else {
								break;
							}
						}conta.usarEstudantil(valorEmprestimo);
					}
					System.out.println("quer fazer outra transação? S/N");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if(opContinuar == 'N') {
						break;
					}
				}
			
			list.add(conta);
				
			}
			else if(op == 6) {
				break;
			}
			else {
				System.out.println("numero inálido!!");
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println("-----------------------------------");
			System.out.println(list.get(i).toString());
			System.out.println("-----------------------------------");
		}
		
	}
}
