package exercicios_java;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		//  Criar um programa para analisar a velocidade de um automóvel. 
		// Solicitar via teclado os valores da aceleração (a em m/s2), velocidade inicial (v0 em m/s) e o tempo de percurso (t em s). 
		// Calcular e exibir a velocidade final do automóvel em km/h. E exibir mensagem de acordo com a tabela abaixo:

		Scanner ler = new Scanner (System.in);
		
		int a, v1, t, v;
		
		System.out.printf("Digite o valor da aceleração: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor da velocidade inicial: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite o valor da tempo de percurso: ");
		t = ler.nextInt();
		
		v = v1 + (a*t);
		
		if (v <=40) {
			System.out.printf("Veículo muito lento, velocidade de %d", v);
		} else if (v > 40 && v <= 60) {
			System.out.printf("Velocidade permitida, velocidade de %d", v);
		} else if (v>60 && v <=80) {
			System.out.printf("Velocidade de cruzeiro, velocidade de %d", v);
		} else if (v > 80 && v <= 120) {
			System.out.printf("Veículo rápido, velocidade de %d", v);
		} else {
			System.out.printf("Veículo muito rápido, velocidade de %d", v);
		}
		
	
		
		
		
	}

}
