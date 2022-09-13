package exercicios_java;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.
		Scanner ler = new Scanner (System.in);
		
		String sexo;
		
		System.out.printf("Insira seu sexo (f/m): ");
		sexo = ler.next();
		
		while (!sexo.equals("m") && !sexo.equals("f")) {
			System.out.printf("Opção inválida. Insira seu sexo (f/m): ");
			sexo = ler.next();
		}
		System.out.printf("Final do programa!");
		
		
		
		
		
		
		
		
	}

}
