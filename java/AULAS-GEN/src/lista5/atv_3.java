package lista5;

import java.util.Scanner;

public class atv_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horas, minutos, segundos;
		System.out.println("diga quantos segundos durou o evento: ");
		segundos = sc.nextInt();

		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;

		System.out.println("O evento durou: " + horas + " horas, " + minutos + " minutis e " + segundos + " segundos.");
		sc.close();
	}

}
