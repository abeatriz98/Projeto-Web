package exercicios_java;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.
		Scanner ler = new Scanner (System.in);
		
		int a,b,c, soma;
		System.out.printf("Insira o valor de A: ");
		a = ler.nextInt();
		
		System.out.printf("Insira o valor de B: ");
		b = ler.nextInt();
		
		System.out.printf("Insira o valor de C: ");
		c = ler.nextInt();
		
		soma = a + b;
		
		if (a + b < c ) {
			System.out.printf("A soma de A + B é %d, menor que c",soma);
		} else {
			System.out.printf("A soma de A + B é %d, maior que c",soma);
		}
	
		
		
		
		
	}

}
