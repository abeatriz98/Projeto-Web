package exercicios_java;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso
		// contrário, enviar mensagem avisando que os números são idênticos.
		
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		if (a > b) {
			System.out.printf("O maior valor é: %d", a);
		} else if (a < b) {
				System.out.printf("O maior valor é: %d", b);
		} else {
			System.out.printf("Os valores são iguais");
		}
		
		
		
		
	}

}
