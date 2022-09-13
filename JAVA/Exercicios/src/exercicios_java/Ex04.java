package exercicios_java;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
		
		Scanner ler = new Scanner (System.in);
		
		int a, b, c, media;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextInt();
		
		media = (a + b + c)/3;
		
		System.out.printf("A media dos valores digitados é %d", media);
		
		
	}

}