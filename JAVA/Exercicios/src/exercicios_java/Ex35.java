package exercicios_java;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. 
		// Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

		Scanner ler = new Scanner (System.in);
		
		int a, i = 1, res;
		
		System.out.printf("Digite o vlor de um número: ");
		a = ler.nextInt();
		
		while (a < 0) {
			System.out.printf("Opa! Opção inválida. Digite um valor positivo: ");
			a = ler.nextInt();
			
		} for (a = a ; i < 11; i++) {
			res = a*i;
			System.out.printf(" %d X %d = %d \n", a, i, res);
		}
		
		
		
		
		
		
		
		
	}

}
