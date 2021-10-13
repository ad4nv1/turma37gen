package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Clt;
import entities.Terceiro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Clt> list = new ArrayList<>();
		int n;
		
		System.out.println("quantos funcionários: ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Dados do funcionário #"+i);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("matricula: ");
			String matricula = sc.next();
			System.out.println("horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.println("valor horas: ");
			double valor = sc.nextDouble();
			System.out.println("Ele é: 1-clt 2-terceirizado");
			int op = sc.nextInt();
			if(op == 1) {
				Clt clt = new Clt(matricula, nome, horas, valor);
				list.add(clt);
			}else {
				System.out.println("valor adicional: ");
				double adicional = sc.nextDouble();
				Clt terceiro = new Terceiro(matricula, nome, horas, valor, adicional);
				list.add(terceiro);
			}
		}
		
		for(Clt clt : list) {
			System.out.println("nome do funcionário: "
								+ clt.getNome()+" matricula: "
								+ clt.getMatricula()
								+" valor a receber: "
								+ clt.salario());
		}
		
		sc.close();

	}

}
