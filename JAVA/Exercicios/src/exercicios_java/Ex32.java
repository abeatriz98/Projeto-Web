package exercicios_java;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. 
		//Caso contrário solicitar novamente apenas o segundo valor.
		
		Scanner ler = new Scanner (System.in);
		int a, b;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		while (a>b) {
			System.out.printf("Valor inválido! Digite novamente o valor: ");
			b = ler.nextInt();
		}
		System.out.printf("Fim do programa!");
		
		
		
		
		
		
		
	}

}
