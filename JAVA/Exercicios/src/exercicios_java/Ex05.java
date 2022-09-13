package exercicios_java;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular
		// e exibir sua temperatura equivalente em Fahrenheit.

		Scanner ler = new Scanner (System.in);
		
		double c, f;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		c = ler.nextDouble();
		
		f = (c * 9/5) + 32;
		
		System.out.printf("A temperatura convertida para F é %.2f", f);
		
		
		
		
	}

}
