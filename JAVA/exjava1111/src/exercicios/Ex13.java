package exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// Entrar via teclado com tr�s valores distintos. Exibir o maior deles.
		
		Scanner ler = new Scanner (System.in);
		int a, b, c;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextInt();
		
		if (a > b && a > c) {
			System.out.printf("O maior valor � o %d", a);	
		}
		if (b > a && b > c){
			System.out.printf("O maior valor � o %d",b);
		} 
		if (c > a && c > b){
			System.out.printf("O maior valor � o %d", c);
		}
		
		
		
		
		
		
		
	}

	private static void and(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
