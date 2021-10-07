package Lista8;

import java.util.Random;
import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int  maior=0, contador=0, totalJogadas=0;
		int jogadas[] = new int[10];
				for(int i=0; i<10;i++){
					jogadas[i] = random.nextInt(6)+1;
					totalJogadas+=jogadas[i];
					if(maior<jogadas[i]){
						maior = jogadas[i];
					}
				}
				for(int i=0; i<10;i++){
					System.out.println("JOGADA " + (i+1) + ": " + jogadas[i] + "\n");
					if(jogadas[i]==maior){
						contador++; 
					}
				}
				
				System.out.println("a média aritmética das jogadas foi: " + (totalJogadas/10) + "\n");
				System.out.println("a maior pontuação foi: " + maior + " e ela apareceu " + contador + " vezes\n");
		sc.close();

	}

}
