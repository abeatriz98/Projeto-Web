package exercicios_java;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja 
		// negativo, imprimindo o resultado.
		
		Scanner ler = new Scanner (System.in);
		
		int a, res;
		
		System.out.printf("Entre com um valor: ");
		a = ler.nextInt();
		if (a > 0) {
			res = 2 * a;
			System.out.printf("O dobro do valor digitado é: %d",res);
		}else {
			res = 3 * a;
			System.out.printf("O triplo do valor digitado é: %d",res);
		}
		
		
		
		
		
		
		
	}

}
