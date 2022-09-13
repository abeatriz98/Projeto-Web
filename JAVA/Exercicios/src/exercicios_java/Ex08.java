package exercicios_java;

import java.util.Scanner;


public class Ex08 {

	public static void main(String[] args) {
		// Entrar via teclado, com dois valores distintos. Exibir o maior deles.

		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		if (a > b) {
			System.out.printf("O maior valor é: %d", a);
		} else {
				System.out.printf("O maior valor é: %d", b);
		}
		

	}

}
