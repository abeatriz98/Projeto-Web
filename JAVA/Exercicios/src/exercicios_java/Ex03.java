package exercicios_java;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

		Scanner ler = new Scanner(System.in);
		
		int b, h, area;
		
		System.out.printf("Digite a base do triangulo: ");
		b = ler.nextInt();
		
		System.out.printf("Digite a altura do triangulo: ");
		h = ler.nextInt();
		
		area = (b*h)/2;
		
		System.out.printf("A área do triângulo é %d", area);
		
		
	}

}