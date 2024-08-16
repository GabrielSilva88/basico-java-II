/*
Escreva um programa que leia o peso e a altura de uma pessoa e calcule o seu índice de massa corporal (IMC). 

Fórmula do IMC: peso / (altura * altura). 

De acordo com o IMC, mostre a classificação da pessoa: 

IMC:Abaixo de 18,5 
Classificação:Abaixo do peso

IMC:Entre 18,5 e 24,9
Classificação:Peso normal

IMC:Entre 25 e 29,9
Classificação:Sobrepeso

IMC:Entre 30 e 34,9
Classificação:Obesidade grau I

IMC:Entre 35 e 39,9
Classificação:Obesidade grau II

IMC:Acima de 40
Classificação:Obesidade grau III

*/
package decimoPrimeiro;

import java.util.Scanner;

public class IndiceMassaCorporal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double peso = 0, altura = 0;

		System.out.println("Índice de Massa Corporal, Incira seu peso em KG e altura M");
		System.out.println("Digite sua Altura(m): ");
		altura = scan.nextDouble();

		System.out.println("Digite seu Peso(Kg): ");
		peso = scan.nextDouble();

		double IMC = peso / (altura * altura);

		if (IMC < 18.5) {
			System.out.printf("IMC: %.2f, Classificação:Abaixo do peso", IMC);
		} else if (IMC <= 24.9) {
			System.out.printf("IMC: %.2f, Classificação:Peso normal", IMC);
		} else if (IMC <= 29.9) {
			System.out.printf("IMC: %.2f, Classificação:Sobrepeso", IMC);
		} else if (IMC <= 34.9) {
			System.out.printf("IMC: %.2f, Classificação:Obesidade grau I", IMC);	
		} else if (IMC <= 39.9) {
			System.out.printf("IMC: %.2f, Classificação:Obesidade grau II", IMC);
		} else {
			System.out.printf("IMC: %.2f, Classificação:Obesidade grau III", IMC);
		}

	}
}
