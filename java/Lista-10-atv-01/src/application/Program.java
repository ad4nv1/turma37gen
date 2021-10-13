package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Animal> list = new ArrayList<>();
		
		System.out.println("quantos animais serão cadastrados: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("ANIMAL #"+i+ ": ");
			System.out.println("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Ele é? 1-Cachorro 2-Cavalo 3-preguiça ");
			int opAnimal = sc.nextInt();
			if(opAnimal == 1) {
				Animal ani = new Cachorro(nome, idade);
				list.add(ani);
			}else if(opAnimal == 2) {
				Animal ani = new Cavalo(nome, idade);
				list.add(ani);
			}else if(opAnimal == 3) {
				Animal ani = new Preguica(nome, idade);
				list.add(ani);
			}
			
		}
		
		for(Animal ani : list) {
			System.out.println("seu nome é: "
								+ ani.getNome()
								+ ", idade: "
								+ani.getIdade()
								+ " anos, habilidade: " 
								+ ani.habilidade()
								+ " e Som emitido "
								+ani.som());
		}
		
		
		sc.close();

		
	}

}
