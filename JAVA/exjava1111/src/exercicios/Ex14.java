package exercicios;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		//  Entrar com o peso e a altura de uma determinada pessoa. Ap�s a digita��o, exibir se esta pessoa est� ou n�o com seu peso ideal. F�rmula: peso/altura�.
	
	Scanner ler = new Scanner (System.in);
	
	int p, h, imc;
	
	System.out.printf("Digite o valor do peso: ");
	p = ler.nextInt();
	
	System.out.printf("Digite o valor da altura: ");
	h = ler.nextInt();
	
	imc = p/(h*h);
	
	
	System.out.printf("O valor do imc � %d", imc);
	
	
	

	}
}