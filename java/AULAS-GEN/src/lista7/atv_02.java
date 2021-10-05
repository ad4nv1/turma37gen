package lista7;

import java.util.Scanner;

public class atv_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contadorPares = 0, contadorImpares = 0,contadorZero = 0, numero;
		
		for(int i=0;i<10;i++){
			System.out.println("digite o numero "+(i+1)+": ");
			numero = sc.nextInt();
			if((numero%2) ==0 && numero>0) {
				contadorPares++;
			}else if((numero%2)!=0){
				contadorImpares++;
			}else {
				contadorZero++;
			}
		}
		
		System.out.println("Você digitou "+contadorPares+" numeros pares");
		System.out.println("Você digitou "+contadorImpares+" numeros impares");
		System.out.println("Você digitou "+contadorZero+" vezes o 0");
		
		sc.close();
		
		
	}
	/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
}

/*Scanner sc = new Scanner(System.in);
int idade, sexo, temperamento, contadorPessoasCalmas=0, 
contadorMulheresNervosas =0, 
contadorHomensAgressivos =0,
contadorOutrosCalmos=0,
contadorPessoasMaisDe40=0,
contadorPessoasMenos18=0, contadorPessoa=0;
boolean y = true;


while(y) {
if(contadorPessoa == 7) {
break;
}
contadorPessoa++;

System.out.println("Digite sua idade "+contadorPessoa+": ");
idade = sc.nextInt();
if(idade<0) {
System.out.println("idade inválida");
contadorPessoa--;
continue;
}



System.out.println("selecione uma opção: 1-feminino 2-masculino 3-outros");
sexo = sc.nextInt();



System.out.println("Você se considera uma pessoa: ");
System.out.println("1- pessoa calma");
System.out.println("2- pessoa nervosa");
System.out.println("3- pessoa agressiva");
temperamento = sc.nextInt();


if(temperamento == 1) {
contadorPessoasCalmas++;
}
if(sexo == 1 && temperamento == 2) {
contadorMulheresNervosas++;
}
if(sexo == 2 && temperamento == 3) {
contadorHomensAgressivos++;
}
if(sexo == 3 && temperamento == 1) {
contadorOutrosCalmos++;
}
if(temperamento == 2 && idade > 40) {
contadorPessoasMaisDe40++;
}
if(temperamento == 1 && idade < 18) {
contadorPessoasMenos18++;
}



}
System.out.println("nesta pesquisa temos "+ contadorPessoasCalmas+ " pessoas calmas");
System.out.println("nesta pesquisa temos "+ contadorMulheresNervosas+ " mulheres nervosas");
System.out.println("nesta pesquisa temos "+ contadorHomensAgressivos+ " Homens agressivos");
System.out.println("nesta pesquisa temos "+ contadorOutrosCalmos+ " pessoas que declararam outros que são calmas");
System.out.println("nesta pesquisa temos "+ contadorPessoasMaisDe40+ " pessoas nervosas com mais de 40");
System.out.println("nesta pesquisa temos "+ contadorPessoasMenos18+ " pessoas calmas com menos de 18");


sc.close();*/