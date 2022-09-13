package exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		//Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.
		Scanner ler = new Scanner (System.in);
		
		int c, h, area;
		
		System.out.printf("Entre com o valor do comprimento do retângulo: ");
		c = ler.nextInt();
		
		System.out.printf("Entre com o valor da altura do retângulo: ");
		h = ler.nextInt();
		
		area = c*h;
		
		if (area > 100){
			System.out.printf("O terreno é grande. O valor do retângulo é %d", area);
		}else{
			System.out.printf("O terreno é pequeno. O valor do retângulo é %d", area);
		}
		
		
		
		
		
		
		
	}

}
