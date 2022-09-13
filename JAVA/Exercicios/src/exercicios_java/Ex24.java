package exercicios_java;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. 
		// Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

		Scanner ler = new Scanner (System.in);
		int  a;
		String n, e, s;
		
		System.out.printf("Digite seu nome: ");
		n = ler.next();
		
		System.out.printf("Digite o seu sexo (f/m) : ");
		s = ler.next();
		
		System.out.printf("Digite o seu estado civil (c/s): ");
		e = ler.next();
		
		if (s.equals("f") && e.equals("c"))  {
			System.out.printf("Quantos anos de casada: ");
			a = ler.nextInt();
			System.out.printf("Cadastro realizado! ");
			
		}else {
			System.out.printf("Cadastro realizado! ");
		}
		
		
	}

}
