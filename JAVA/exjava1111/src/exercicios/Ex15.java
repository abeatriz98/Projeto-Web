package exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// A partir de tr�s valores que ser�o digitados, verificar se formam ou n�o um tri�ngulo. 
		// Em caso positivo, exibir sua classifica��o: �Is�sceles, escaleno ou eq�il�tero�. 
		// Um tri�ngulo escaleno possui todos os lados diferentes, o is�sceles, dois lados iguais e o eq�il�tero, 
		// todos os lados iguais. Para existir tri�ngulo � necess�rio que a soma de dois lados quaisquer seja maior 
		// que o outro, isto, para os tr�s lados.

		Scanner ler = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro valor: "); 
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: "); 
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: "); 
		c = ler.nextInt();
		
		if (a + b > c && a + c > b && c + b > a){
			System.out.printf("� um tri�ngulo!!");
			if ( a == b && a==c && b==c ){
				System.out.printf("\n O tri�ngulo � equil�tero");
			}
			else if ( a !=b && a !=c && c !=b){
				System.out.printf("\n O tri�ngulo � is�sceles");
			}
			else {
				System.out.printf("\n O tri�ngulo � escaleno");
			}
		}
		else{
			System.out.printf("\n N�o � um tri�ngulo!");
		}
		
		
			
	}

}
