package exercicios_java;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:
		// MEDIA = (P1 + 2.P2) / 3
		// Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa deverá calcular e exibir quanto o aluno 
		// precisa tirar na segunda nota minimamente (P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.

		Scanner ler = new Scanner (System.in);
		
		int p1, p2, m;
		
		System.out.printf("Digite o valor da primeira nota: ");
		p1 = ler.nextInt();
		
		p2 = 15 - p1;
		
		System.out.printf("Para o aluno(a) ser aprovado(a) deverá tirar na segunda prova a nota mínima de %d",p2);
				
		
		
		
		
		
		
		
		
		
		
	}

}
