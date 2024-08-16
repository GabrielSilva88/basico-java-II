/*
Escreva um programa que leia o salário de um funcionário e aplique um aumento de acordo com a seguinte tabela: 

Faixa salarial: Até R$ 1.500,00 
Percentual de Aumento: 15% 

Faixa Salarial: De R$ 1.500,01 até R$ 2.500,00 Percentual de Aumento: 10% 

Faixa Salarial: Acima de R$ 2.500,00 
Percentual de Aumento: 5%

*/
package decimo;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salario =0, aumento =0;
		
		System.out.println("");
		salario = scan.nextDouble();
		
		if (salario == 1500.00) {
			aumento = (salario * 15)/100;
			salario = salario + aumento;
			System.out.printf("Seu salario atual é %.2f", salario);
		} else if (salario >= 1500.01 && salario == 2500.00) {
			aumento = (salario * 10)/100;
			salario = salario + aumento;
			System.out.printf("Seu salario atual é %.2f", salario);
		} else if (salario > 2500.00) {
			aumento = (salario * 5)/100;
			salario = salario + aumento;
			System.out.printf("Seu salario atual é %.2f", salario);
		} 
		
	}
}
