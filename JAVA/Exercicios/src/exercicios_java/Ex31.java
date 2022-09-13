package exercicios_java;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// Criar uma rotina de entrada que aceite somente um valor positivo
		
		Scanner ler = new Scanner (System.in);
		int a;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		while (a < 0) {
			System.out.printf("Opção inválida! Digite um valor positivo: ");
			a = ler.nextInt();
		}
			System.out.printf("Obrigada!");
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
