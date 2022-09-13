package exercicios_java;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		//Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da 
		// condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo 
		//adequado e exibir o valor a ser pago no final. Código Condição de pagamento
		//1 	À vista em dinheiro ou cheque, recebe 10% de desconto
		//2 	À vista no cartão de crédito, recebe 15% de desconto
		//3 	Em duas vezes, preço normal de etiqueta sem juros
		//4 	Em quatro vezes, preço normal de etiqueta mais juros de 10%
		
		Scanner ler = new Scanner (System.in);
		
		int a, p, r, t;
		
		System.out.printf("Digite o valor do produto: R$ ");
		p = ler.nextInt();
		
		System.out.printf("Escolha a opção de pagamento");
		
		System.out.printf("\n 1 - À vista em dinheiro ou cheque, recebe 10 porcento de desconto");

		System.out.printf("\n 2 - À vista no cartão de crédito, recebe 15 porcento de desconto");
		
		System.out.printf("\n 3 - Em duas vezes, preço normal de etiqueta sem juros");
		
		System.out.printf("\n 4 - Em quatro vezes, preço normal de etiqueta mais juros de 10 porcento");
		
		System.out.printf("\n Escolha a opção: ");
		a = ler.nextInt();
		
		if (a==1) {
			t = p*(90/100);
			System.out.printf("\n O valor a ser pago pelo produto será de R$ %d",t);
			
		} else if (a==2) {
			t = p*(85/100);
			System.out.printf("\n O valor a ser pago pelo produto será de R$ %d",t);
		} else if (a==3) {
			t = p/2;
			System.out.printf("\n O valor a ser pago pelo produto será 2x de R$ %d",t);
		} else if (a==4){
			t = p*(110/100);
			r = t/4;
			System.out.printf("\n O valor a ser pago pelo produto será 4x de R$ %d",r);
		}
		else {
			System.out.printf("Opção inválida!");
		}
		
		
	}

}
