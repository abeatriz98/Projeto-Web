package exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		//Calcular e exibir a �rea de um ret�ngulo, a partir dos valores da base e altura que ser�o digitados. Se a �rea for maior que 100, exibir a mensagem �Terreno grande�, caso contr�rio, exibir a mensagem �Terreno pequeno�.
		Scanner ler = new Scanner (System.in);
		
		int c, h, area;
		
		System.out.printf("Entre com o valor do comprimento do ret�ngulo: ");
		c = ler.nextInt();
		
		System.out.printf("Entre com o valor da altura do ret�ngulo: ");
		h = ler.nextInt();
		
		area = c*h;
		
		if (area > 100){
			System.out.printf("O terreno � grande. O valor do ret�ngulo � %d", area);
		}else{
			System.out.printf("O terreno � pequeno. O valor do ret�ngulo � %d", area);
		}
		
		
		
		
		
		
		
	}

}
