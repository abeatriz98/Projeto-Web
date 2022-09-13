package exercicios_java;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
		Scanner ler = new Scanner(System.in);
		
		int h, b, area;
		System.out.printf("Digite o valor da altura: ");
		h = ler.nextInt();
		
		System.out.printf("Digite o valot da base: ");
		b = ler.nextInt();
		
		area = h* b;
		
		System.out.printf("A área do retângulo é: %d", area);
				
	}

}
