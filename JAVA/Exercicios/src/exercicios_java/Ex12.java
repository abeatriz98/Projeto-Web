package exercicios_java;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// Calcular e exibir a área de um retângulo, a partir dos valores da base e
		// altura que serão digitados. Se a área for maior que 100, exibir a mensagem
		// “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.

		Scanner ler = new Scanner(System.in);
		int b, h, area;

		System.out.printf("Digite o valor da altura: ");
		h = ler.nextInt();
		
		System.out.printf("Digite o valor da base: ");
		b = ler.nextInt();
		
		area = b*h;
		
		if (area > 100 ) {
			System.out.printf("Área do terreno é grande! %d metros quadrados",area);
		} else {
			System.out.printf("Área do terreno é pequena! %d metros quadrados", area);
		}
		
		
		
		
	}

}
