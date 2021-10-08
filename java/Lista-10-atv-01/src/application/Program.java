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
			
			String nome = sc.next();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Ele é? 1-Cachorro 2-Cavalo 3-preguiça ");
			int opAnimal = sc.nextInt();
			System.out.println("qual o som ele emite: ");
			
			String som = sc.next();
			if(opAnimal == 1) {
				Animal ani = new Cachorro(nome, idade, som);
				list.add(ani);
			}else if(opAnimal == 2) {
				Animal ani = new Cavalo(nome, idade, som);
				list.add(ani);
			}else if(opAnimal == 3) {
				Animal ani = new Preguica(nome, idade, som);
				list.add(ani);
			}
			
		}
		
		for(Animal ani : list) {
			System.out.println(ani.getNome()+ani.getIdade() + ani.habilidade());
			
		}
		
		
		sc.close();

	}

}
