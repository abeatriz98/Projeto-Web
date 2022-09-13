package exercicios_java;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar
		// um valor referente ao pagamento da somatória destes valores. Calcular e
		// exibir o troco que deverá ser devolvido.

		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e, total, pago, troco;
		
		System.out.printf("Digite o valor do primeiro produto R$");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto R$");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto R$");
		c = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto R$");
		d = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto R$");
		e = ler.nextDouble();
		
		total = (a+ b + c+ d + e);

		System.out.printf("O total dos produtos foi de R$ %.2f", total);
		
		System.out.printf("\n Qual valor irá dar? R$ ");
		pago = ler.nextDouble();
		
		troco = pago - total;
		
		System.out.printf("O valor do troco é de R$ %.2f", troco);
		
	}

}