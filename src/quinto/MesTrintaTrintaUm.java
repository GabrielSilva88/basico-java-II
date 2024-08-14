/*Escreva um programa que leia o mês do ano em número (1 a 12) e diga quantos dias ele tem. 
 * Considere que o ano não é bissexto.*/
package quinto;

import java.util.Scanner;

public class MesTrintaTrintaUm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Calendario do Ano, informa quantidade de dias do mês.");
		System.out.println("Digite o número do mes: ");
		int mes = scan.nextInt();

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12: {
			System.out.println("Mês " + mes + " Possui 31 dias.");
			break;
		}
		case 4, 6, 9, 11: {
			System.out.println("Mês " + mes + " Possui 30 dias.");
			break;
		}
		case 2: {
			System.out.println("Mês " + mes + " Possui 28 dias.");
			break;
		}
		default:
			System.out.println("Mês não exite");
			break;
		}
	}
}


