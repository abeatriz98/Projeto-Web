package exercicios_java;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. 
		// Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), 
		// deverá ser maior que o primeiro (A), caso contrário, digitar novamente somente o segundo. Após a validação dos dados, 
		// exibir a tabuada do valor digitado, no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.

		Scanner ler = new Scanner (System.in);
		
		int a, b, c, i=1, res;
		
		System.out.printf("Entre com um número: ");
		a = ler.nextInt();
		
		while (a < 0) {
			System.out.printf("Valor inválido! Entre com um número positivo: ");
			a = ler.nextInt();
		}
		System.out.printf("Digite o primeiro valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		c = ler.nextInt();
		
		while (c < b) {
			System.out.printf("Valor inválido. Digite novamente o segundo valor: ");
			c = ler.nextInt();
		} 
		
		for (b=b; i < c+1 ; i++ ) {
			res = a*i;
			
			System.out.printf(" %d X %d = %d \n ", a, i, res);
		}
		
		
		
		
		
		
	}

}
