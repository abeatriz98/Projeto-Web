package exercicios_java;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// Entrar com o peso, o sexo e a altura de uma determinada pessoa. 
		// Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

		Scanner ler = new Scanner (System.in);
		
		int p, h, imc;
		String sexo;
		
		System.out.printf("Digite o seu peso: ");
		p = ler.nextInt();
		
		System.out.printf("Digite a sua altura :");
		h = ler.nextInt();
		
		imc = p/(h*h);
		
		System.out.printf("Digite o seu sexo (f/m): ");
		sexo = ler.next();
		
		if (sexo.equals('f')) {
			if (imc < 19) {
				System.out.printf("Você está abaixo do peso, pois seu imc deu %d",imc);
			} else if (imc >= 19 && imc <= 24) { 
				System.out.printf("Você está com peso ideal, pois seu imc deu %d ",imc);
			} else if (imc > 25) {
				System.out.printf("Você está acima do peso, pois seu imc deu %d", imc);	
			}
		    	
		} else {
			 if (imc < 20) { 
				 System.out.printf("Você está abaixo do peso, pois seu imc deu %d", imc);
			 }else  if (imc > 20 && imc <= 25){
				 System.out.printf("Você está com peso ideal, pois seu imc deu %d", imc);
			 } else if (imc > 25) { 
				 System.out.printf("Você está acima do peso, pois seu imc deu %d", imc); 
			 }	
		}
		
		
		
		
		
		
		
		
	}

}
