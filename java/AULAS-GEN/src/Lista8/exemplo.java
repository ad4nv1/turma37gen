package Lista8;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
int x, y;
		
		System.out.println("digite o valor x: ");
		x = sc.nextInt();
		System.out.println("digite o valor y: ");
		y = sc.nextInt();
		
		System.out.println(soma(x, y));
		System.out.println(divisao(x, y));
		System.out.println(sub(x, y));
				
		funcaoVoid();
		
		
		sc.close();

	}
	
	public static int soma(int x,int y) {
		int Soma = x+y;
		return Soma;
	}
	public static int divisao(int x,int y) {
		int divisao = x/y;
		return divisao;
	}
	public static int sub(int x,int y) {
		int Sub = x-y;
		 return Sub;
	}
	
	public static void funcaoVoid() {
		int x = 2+4;
		System.out.println("funcao void "+ x);
	}
	
	
public static void linha(int tamanho) {
		
		for (int x=1; x<=tamanho; x++) {
			if (x<=20) {
				System.out.print("x");//176
			} else if (x<=40) {
				System.out.print("x");//177
			}
			else {
				System.out.print("x");//178
			}
						
		}
		
	}

	
	
	


/*int nomes[] = new int[8], x;

for(int n : nomes ) {
	System.out.println("digite um valor: ");
	x = sc.nextInt();
	nomes[n] = x;
}

for(int n : nomes ) {
	
	System.out.println(nomes[n]);
	
}*/

	}


