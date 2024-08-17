/*Escreva um programa que leia a idade de uma pessoa e diga se ela pode votar ou não nas eleições. 
	No Brasil, o voto é obrigatório para pessoas entre 18 e 70 anos, 
	e facultativo para pessoas entre 16 e 18 anos ou maiores de 70 anos.*/
package quarto;

import java.util.Scanner;

public class IdadeVotar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a idade, verificar se vota ou não.");
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();

		if (idade >= 18 && idade <= 70) {
			System.out.println("No Brasil, o voto é obrigatório na sua idade.");
		} else if (idade > 15 && idade < 18 || idade > 70) {
			System.out.println("No Brasil, o voto é facultativo para sua idade.");
		}else {
			System.out.println("No Brasil, não pode votar");
		}
	}
}
