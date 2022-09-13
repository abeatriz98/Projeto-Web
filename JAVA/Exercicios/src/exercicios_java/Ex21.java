package exercicios_java;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de opções (“menu”) com as seguintes opções: 
		// (Fazer esse exercício utilizando If..Else e/ou Case)
		// 1 – Multiplicação 2 – Adição 3 – Divisão 4 – Subtração 5 – Fim de processo (sair do programa)
		// Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) e processar a respectiva operação.
		// Enviar mensagem de erro se a opção escolhida não existir no seletor.
		// Encerrar o programa somente quando o usuário escolher a opção de finalização. Repare que a opção de número três é de divisão e o 
		// programa deverá enviar mensagem de erro, (somente nesta opção) se o denominador for zero.

		Scanner ler = new Scanner (System.in);
		
		int a, b, num, res;
		
		System.out.printf("Digite primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("Escolha uma das opções abaixo: ");
		System.out.printf("\n 1 - Multiplicação ");
		System.out.printf("\n 2 - Adição: ");
		System.out.printf("\n 3 - Divisão: ");
		System.out.printf("\n 4 - Subtração ");
		System.out.printf("\n 5 - Fim de processo: ");
		
		System.out.printf("Digite a opção desejada: ");
		num = ler.nextInt();
		
		if (num == 1) {
			res = a * b;
			System.out.printf("O resultado da opção desejada é %d", res);
		} else if (num ==2) {
			res = a+b;
			System.out.printf("O resultado da opção desejada é %d", res);
		} else if (num == 3){
			if (b==0) {
				System.out.printf("Divisão inválida!");
			} else {
				res = a/b;
				System.out.printf("O resultado da opção desejada é %d", res);
			}
		}else if (num ==4) {
			res = a - b;
			System.out.printf("O resultado da opção desejada é %d", res);
		} else if (num ==5) {
			System.out.printf("Fim do programa!");
		} else {
			System.out.printf("Opção não encontrada");
		}
		
		
		
		
		
		
		
		
		
	}

}
