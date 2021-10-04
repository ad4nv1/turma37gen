package lista5;

import java.util.Scanner;

public class auxilio_emergencial {


		    public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);

		        int auxilio = 600;
		        String nome,pronome;
		        int filhos,valor=0,total=0;
		        char opPronome,chef, segundoAuxilio;


		        System.out.println("Qual seu nome: ");
		        nome = leia.next();

		        System.out.println("Voce é chefa de familia: ");
		        chef = leia.next().toUpperCase().charAt(0);
		        if(chef == 'S' ) {
		            valor = auxilio * 2;
		       }else {
		            valor = auxilio;
		        }
		        System.out.println("Quantos filhos voce tem: ");
		        filhos = leia.nextInt();
		        
		        total = valor + (filhos*50);

		        

		        System.out.println("Por qual pronome de preferencia A/O/E: ");
		        opPronome = leia.next().toUpperCase().charAt(0);
		        if(opPronome == 'A'){
			         pronome = "senhora";
			        }else if(opPronome == 'O') {
			            pronome = "senhor";
			        }else {
			            pronome = "senhore";
			        }
		        System.out.println("Voce recebe outro auxilio: ");
		        segundoAuxilio = leia.next().toUpperCase().charAt(0);
		        if(segundoAuxilio == 'S') {
		            System.out.println("Voce não pode receber auxilio");
		        }else {
		        System.out.println(pronome + " " + nome + " você receberá " + total);
		        }

		        leia.close();


		    }

		}
	        /*AUXILIO EMERGENCIAL = 600
			CHEFAS DE FAMILIA = DOBRO
			POR FILHO GANHA +50
			RECEBE OUTRO AUXILIO NÃO PODE RECEBER EMERGENCIAL
			NOME DA PESSOA
			SE ELA É CHEFA DE FAMILIA
			A QTDE DE FILHOS
			E SE PEGOU OUTRO AUXILIO
			MOSTRA O AUXILIO FINAL QUE A MESMA VAI RECEBER OU NÃO
			USAR O TRATAMENTO CONFORME A PESSOA SE DEFINE /O/A/E*/



