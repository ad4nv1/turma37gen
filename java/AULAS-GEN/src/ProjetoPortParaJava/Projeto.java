package ProjetoPortParaJava;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String loja[][] = {
				{"G1-1","Iphone 5s", "750.0", "10", "0"}, 
				{"G1-2", "Iphone6", "900.0", "10", "0"}, 
				{"G1-3", "Iphone 7", "1500.0", "10", "0"},
				{"G1-4", "Iphone 7 P", "1999.9", "10", "0"},
				{"G1-5", "Iphone 8", "2300.0", "10", "0"},
				{"G1-6", "Iphone 8 P", "2550.9", "10", "0"},
				{"G1-7", "Iphone X", "3000.0", "10", "0"},
				{"G1-8", "Iphone 11", "6500.0", "10", "0"},
				{"G1-9", "Iphone 11 P", "7999.9", "10", "0"},
				{"G1-10", "Iphone 12", "10000.0", "10", "0"}};

			String codCompra, confirmaCompra = "",validacao = "";
			char op;
			boolean loop = true;
			int opcaoPagamento = 0;
			double totalCompra = 0.0, qtdCompra = 0.0, valorCompra = 0.0, imposto = 0.0, valor10Porcento = 0.0, aumento15=0.0;

			dadosLoja();
			
			while (loop){

				System.out.println("\nVocê deseja fazer compras? (S/N): ");
					op = sc.next().toUpperCase().charAt(0);  
				

				
				while(loop) {
					if((op == 'S') || (op == 'N')) {
						break;
					
					}else {
						System.out.println("Digite S ou N:");
						op = sc.next().toUpperCase().charAt(0); 
						
					}	
				}
				if (op == 'N'){
					System.out.println("\nATÉ BREVE!!!\n");
					break;
					}

					
				
				for(int x = 0;x<1;x++){
					System.out.println("_____________________NOSSOS PRODUTOS____________________");
					System.out.println("CÓDIGO           PRODUTO          VALOR         ESTOQUE ");
					System.out.println("********************************************************");
					System.out.println("--------------------------------------------------------");
					for (int i=0; i<10; i++){
						for (int j=0;j<4; j++){
							System.out.print("[ " + loja[i][j] +" ]\t");		
						}
						System.out.println("");
						System.out.println("------------------------------------------------------");
						
					}
				}
				System.out.println("CARRINHO DE COMPRAS: \n");
				for (int i=0; i<10; i++){
							if(loja[i][4]!= "0"){
								System.out.println(
								loja[i][0]+"  "+
								loja[i][1]+ 
								"  "+loja[i][2]+
								"  "+loja[i][3]+
								"  "+qtdCompra);
								}
				}
				
				System.out.println("\n");
				System.out.println("*****************************************************************");
				System.out.println("");

				do{
					System.out.println("\n____VAMOS AS COMPRAS <3___\n");
					System.out.println("Digite o código do produto que deseja comprar: ");
					
					codCompra = sc.next().toUpperCase();
					
				
				for(int i=0;i<10;i++){
					if(codCompra.equals(loja[i][0])){
						validacao = "S";
						break;
						
					}
				}
				
				if(validacao == "S"){
					System.out.println ("CÓDIGO     PRODUTO    VALOR      ESTOQUE \n");
				for(int i=0;i<10;i++){
					if(codCompra.equals(loja[i][0])){
						System.out.println(
							loja[i][0]+
							"\t"+ loja[i][1]+
							"\t"+ loja[i][2]+
							"\t"+loja[i][3]);
						
					}
				}
				System.out.println("");
				System.out.println("*****************************************************************");
				System.out.println("");
				System.out.println("Digite a quantidade: ");
					qtdCompra = sc.nextDouble();
				for(int i=0;i<10;i++){
						if(codCompra.equals(loja[i][0])){
							if(qtdCompra < Double.valueOf(loja[i][3]) && qtdCompra > 0){
								loja[i][4] = Double.toString(qtdCompra);	
							}
							else if(qtdCompra < 0){
								System.out.println("Não pode numero negativo. ");
								
							}else{
								System.out.println("Não possui estoque sufuciente. ");
							}
						}
					}
				}else {
					System.out.println("PRODUTO NÃO ENCONTRADO!!");
					}
				System.out.println("");
				System.out.println("*****************************************************************");
				System.out.println ("CARRINHO DE COMPRAS: ");
				System.out.println ("*********************");
				for (int i=0; i<10; i++){
							if(loja[i][4]!= "0"){
								System.out.println("COD: "+
								loja[i][0] +"  PRODUTO: "+
								loja[i][1] + 
								"  "+ loja[i][2] +
								"  QTD ESTOQUE: "+ loja[i][3] +
								"  QTD SELECIONADA: "+ loja[i][4] +"\n");
								} 
				}
				
				validacao = "";
				System.out.println("");
				System.out.println("*****************************************************************");
				System.out.println("");
				System.out.println("\ndeseja continuar comprando? (S/N) ");
					confirmaCompra = sc.next().toUpperCase();
				
				if(confirmaCompra.equals("N")){
					break;
				}
				}while(loop);
				for (int i=0; i<10; i++){
					valorCompra = Double.valueOf(loja[i][2]) * Double.valueOf(loja[i][4]);
					loja[i][3] = Double.toString(Double.valueOf(loja[i][3]) - Double.valueOf(loja[i][4]));
					totalCompra += valorCompra;
						
				}
				
				System.out.println("");
				dadosLoja();
				System.out.println("");
				System.out.println("Valor total da compra: "+ totalCompra);
				System.out.println("");
				imposto = totalCompra * 0.09;
				System.out.println("Terá "+ imposto+ " em imposto sobre a compra ");
				System.out.println("");
				valor10Porcento = totalCompra * 0.10;
				System.out.println("Caso o valor seja pago a vista terá: "+ valor10Porcento + " de desconto");
				System.out.println("");
				System.out.println("Caso o valor seja pago no cartão terá: "+ valor10Porcento + " de acrescimo");
				System.out.println("");
				aumento15 = totalCompra * 0.15;
				System.out.println("Caso o valor seja pago no cartão em 2 vezes terá: "+ aumento15 + " de acrescimo");
				System.out.println("");
				System.out.println("*****************************************************************");
				System.out.println("");
				System.out.println("escolha uma opção de pagamento: 1- A Vista; 2 - Cartão; 3 - Duas vezes no cartão ");
						opcaoPagamento = sc.nextInt();
				while(loop){
					if(opcaoPagamento == 1 || opcaoPagamento == 2 || opcaoPagamento == 3){
						break;
					}else{
						System.out.println("OPÇÃO INVÁLIDA, DIGITE UM DOS 3 NUMEROS ");
							opcaoPagamento = sc.nextInt();
						
					}
					
				}
				
				System.out.println("");
				System.out.println("*****************************************************************");
				System.out.println("*****************************************************************");
				System.out.println("************************NOTA FISCAL******************************");
				System.out.println("*****************************************************************");
				System.out.println("*****************************************************************");
				System.out.println("");
				System.out.println("VALOR DA COMPRA: "+ totalCompra );
				System.out.println("------------------------------------------------------");
				System.out.println("VALOR EM IMPOSTOS: "+ imposto );
				System.out.println ("------------------------------------------------------");
				System.out.println("ITEMS DA COMPRA: ");
				for (int i=0; i<10; i++){
							if(loja[i][4]!= "0"){
								System.out.println("  PRODUTO: "+ loja[i][1] +"  PREÇO :"+ loja[i][2] +
								"  QTD COMPRADA: "+ loja[i][4] );
								}
				}
				System.out.println("------------------------------------------------------");
				System.out.println("FORMA DE PAGAMENTO SELECIONADA: ");
				switch(opcaoPagamento){
					case 1:
						System.out.println("PAGAMENTO A VISTA, DESCONTO DE 10%, VALOR FINAL: "+
						( totalCompra - valor10Porcento ));
						break;
					case 2:
						System.out.println("PAGAMENTO NO CARTÃO, ACRESCIMO DE 10%, VALOR FINAL: "+
						( totalCompra  + valor10Porcento ));
						break;
					case 3:
						System.out.println("PAGAMENTO NO CARTÃO EM 2X, ACRESCIMO DE 15%, VALOR DAS PARCELAS: "+
						((totalCompra + aumento15 ) / 2));
						break;

				}
				System.out.println("*****************************************************************\n");
				System.out.println("*****************************************************************\n");
				System.out.println("OBRIGADO POR USAR NOSSOS SERVIÇOS\n");

				
				for (int i=0; i<10; i++){
					loja[i][4] = "0";
				}
				totalCompra = 0.0;
				qtdCompra = 0.0;
				valorCompra = 0.0;
				imposto = 0.0;
				valor10Porcento = 0.0;
				aumento15=0.0;
				}
			sc.close();
			}
	
	public static void dadosLoja(){
		System.out.println ("________LOJA VIAJ²________");
		System.out.println ("Tecnologia de qualidade!");
		System.out.println ("---------------------------");
		System.out.println ("");
	}
		}
		
		
		
		

		

