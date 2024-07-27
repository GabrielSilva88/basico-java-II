/*Escreva um programa que leia um número inteiro do usuário e diga se ele é par ou ímpar.*/

package primeiro;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Verificador de Impar ou Par, Digiete um número: ");
		int numero = scan.nextInt();
		
		if (numero % 2 != 0) {
			System.out.println("Número inteiro e Impar!");
		} else {
			System.out.println("Número inteiro e Par!");
		}
	}

}
