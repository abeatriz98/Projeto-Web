package exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// A partir de três valores que serão digitados, verificar se formam ou não um triângulo. 
		// Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. 
		// Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, 
		// todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior 
		// que o outro, isto, para os três lados.

		Scanner ler = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro valor: "); 
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: "); 
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: "); 
		c = ler.nextInt();
		
		if (a + b > c && a + c > b && c + b > a){
			System.out.printf("É um triângulo!!");
			if ( a == b && a==c && b==c ){
				System.out.printf("\n O triângulo é equilátero");
			}
			else if ( a !=b && a !=c && c !=b){
				System.out.printf("\n O triângulo é isósceles");
			}
			else {
				System.out.printf("\n O triângulo é escaleno");
			}
		}
		else{
			System.out.printf("\n Não é um triângulo!");
		}
		
		
			
	}

}
