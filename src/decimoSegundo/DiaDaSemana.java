/*
Escreva um programa que leia um número inteiro entre 1 e 7 e mostre o dia da semana correspondente. 
Se o número não estiver nesse intervalo, mostre uma mensagem de erro.
*/
package decimoSegundo;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual e o dia da semana? \rEscolha um número entre 1 a 7.");
		System.out.println("Digite o número: ");
		int n = scan.nextInt();

		switch (n) {
		case 1: {

			System.out.println(n + " é um Domingo");
			break;
		}
		case 2: {

			System.out.println(n + " é uma Segunda-feira.");
			break;
		}
		case 3: {

			System.out.println(n + " é uma Terça-feira");
			break;
		}
		case 4: {

			System.out.println(n + " é uma Quarta-feira");
			break;
		}
		case 5: {

			System.out.println(n + " é uma Quinta-feira");
			break;
		}
		case 6: {
			System.out.println(n + " é uma Sexta-feira");
			break;
		}
		case 7: {
			System.out.println(n+ " é um Sábado");
			break;
		}
		default:
			System.out.println(n + " não é uma opção");
			break;
		}
		
	}
}


