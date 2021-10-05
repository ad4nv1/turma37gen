package lista7;

import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 for(int i = 1000; i<2000;i++) {
		 if((i%11)==5) {
			 System.out.println(i);
		 }
	 }
	 sc.close();
	 
	 

	}
	/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

}
