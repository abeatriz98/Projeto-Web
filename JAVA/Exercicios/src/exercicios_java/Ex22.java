package exercicios_java;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// Exibir o seguinte seletor de opções e em função de uma escolha, solicitar os dados necessários para o cálculo da respectiva área. 
		// Enviar mensagem de erro se o usuário escolher uma opção inexistente.
		// Encerrar o programa somente quando selecionada a opção de finalização. (Fazer esse exercício utilizando If..Else e/ou Case)
		// 1 – Triângulo 2 – Quadrado 3 – Retângulo 4 – Círculo 5 – Fim de processo

		Scanner ler = new Scanner (System.in);
		
		int num, h, b, area;
		
		System.out.printf("Escolha uma das opções abaixo: ");
		System.out.printf("\n 1 - Triângulo ");
		System.out.printf("\n 2 - Quadrado ");
		System.out.printf("\n 3 - Retângulo ");
		System.out.printf("\n 4 - Círculo ");
		System.out.printf("\n 5 - Fim de processo: ");
		
		System.out.printf("Digite a opção desejada: ");
		num = ler.nextInt();
		
		if (num == 1) {
			System.out.printf("Digite o valor da base do triângulo: ");
			b = ler.nextInt();
			
			System.out.printf("Digite o valor da altura do triângulo: ");
			h = ler.nextInt();
			
			area = (b*h)/2;
			System.out.printf("A área do triângulo é %d ",area);
		}else if (num ==2) {
			System.out.printf("Digite o lado do quadrado: ");
			b = ler.nextInt();
			area = b*b;
			System.out.printf("A área do quadrado é %d ",area);
		} else if (num ==3){
			System.out.printf("Digite o valor do comprimento do retângulo: ");
			b = ler.nextInt();
			
			System.out.printf("Digite o valor da altura do retângulo: ");
			h = ler.nextInt();
			
			area = b*h;
			System.out.printf("A área do retângulo é %d ",area);
		} else if (num==4) {
			System.out.printf("Digite o valor do raio do círculo: ");
			b = ler.nextInt();
			
			area = 3*b;
			System.out.printf("A área do cículo é %d ",area);
		} else if (num ==5) {
			System.out.printf("Final do processo");
		} else {
			System.out.printf("Opção inválida!");
		}
		
		
		
		
		
		
		
	}

}
