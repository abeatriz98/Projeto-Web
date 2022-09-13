package exercicios_java;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// Exibir a tabuada do número cinco no intervalo de um a dez

		Scanner ler = new Scanner (System.in);
		
		int a = 5, i = 1, r ;
		
		while (i < 11) {
			r = a*i;
			System.out.printf("%d X %d = %d \n",a,i,r);
			i = i+1;
		}
		
		
		
		
		
		
		
		
	}

}
