package exercicios_java;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		//  Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 
		// caso seja ímpar, imprimir o resultado desta operação.
		
		Scanner ler = new Scanner (System.in);
		int a, b, res;
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		if (a % 2 == 0) {
			res = a + 5;
			System.out.printf("O valor digitado é par, somado com 5 dá %d", res);
		} else {
			res = a + 8;
			System.out.printf("O valor digitado é ímpar, somado com 8 dá %d", res);
		}
		
		
		
		
		
		
		
		
	}

}
