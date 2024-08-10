/* 
	Escreva um programa que leia a temperatura em graus Celsius
	e converta para graus Fahrenheit ou Kelvin, de acordo com a escolha do usuário. 

A fórmula para converter Celsius para Fahrenheit é: 
F = (C * 9/5) + 32. 
A fórmula para converter Celsius para Kelvin é 
K = C + 273.15.

*/
package nono;

import java.util.Scanner;

public class ConverterTemperatura {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double C = 0, F = 0, K = 0;

		System.out.println("Converter Celsius para Fahrenheit ou Kelvin \r" + "Digiete o valor em Celsius: ");
		C = scan.nextDouble();

		System.out.println("Digite a opção: \r 1 - Fahrenheit \r 2 - Kelvin \r Digite uma opção:");
		int opcao = scan.nextInt();

		/*
		 * if (opcao == 1) { F = (C * 9 / 5) + 32;
		 * System.out.println("Valor em Fahrenheit é " + F); } else if (opcao == 2) { K
		 * = C + 273.15; System.out.println("Valor em Kelvin é " + K); } else {
		 * System.out.println("não e uma opção de conversão."); }
		 */

		// OPÇÃO NO SWITCH CASE

		switch (opcao) {
		case 1: {
			F = (C * 9 / 5) + 32;
			System.out.println(" Fahrenheit é "+ F);
			break;
		}
		case 2: {
			K = C + 273.15;
			System.out.println(" Kelvin é " + K);
			break;
		}

		default:
			System.out.println(" Não e um opção para converter.");
		}

	}
}
