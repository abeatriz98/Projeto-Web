package exercicios_java;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:
		// MEDIA = (P1 + 2.P2) / 3
		// Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média. Exibir a situação final do aluno 
		// (“Aprovado ou Reprovado”), sabendo que a média de aprovação é igual a cinco.

		Scanner ler = new Scanner (System.in);
		
		int p1, p2, m;
		
		System.out.printf("Digite o valor da primeira nota: ");
		p1 = ler.nextInt();
		
		System.out.printf("Digite o valor da segunda nota: ");
		p2 = ler.nextInt();
		
		m = (p1 + (2*p2))/3;
		
		if (m < 5 ) {
			System.out.printf("Aluno reprovado, nota %d", m);
		} else {
			System.out.printf("Aluno aprovado, nota %d", m);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
