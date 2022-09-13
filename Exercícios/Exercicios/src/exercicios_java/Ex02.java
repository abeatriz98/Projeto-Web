package exercicios_java;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado
		
		Scanner ler = new Scanner(System.in);
		
		int l, area;
		System.out.printf("Digite o valor do lado do quadrado: ");
		l = ler.nextInt();
		
		area = l*l;
		System.out.printf("A área do quadrado é %d", area);
	}

}
