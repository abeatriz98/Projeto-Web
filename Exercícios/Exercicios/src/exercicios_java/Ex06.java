package exercicios_java;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
		// dólares. Calcular e exibir o valor correspondente em Reais (R$).

		Scanner ler = new Scanner(System.in);
		float c, r, d;
		
		System.out.printf("Digite o valor da cotação do dolar: ");
		c = ler.nextFloat();
		
		System.out.printf("Digite a quantidade de dólares que possui U$ ");
		d = ler.nextFloat();
		
		r = (c*d);
		
		System.out.printf("O valor em reais é de: R$ %.2f", r);
		
		
		
	}

}
