/*

 Escreva um programa que leia a hora atual em formato 24 horas (0 a 23) e mostre uma saudação de acordo com o período do dia.
 Se a hora não estiver nesse intervalo, o programa deve mostrar “Hora inválida”.
 Por exemplo, se a hora for 8, o programa deve mostrar “Bom dia”.
 
*/
package decimoQuarto;

import java.util.Scanner;

public class PeriodoDia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Formato 24hs, Digite a hora: ");
		double hora = scan.nextDouble();

		if (hora >= 0 && hora <= 23) {
			if (hora >= 8 && hora <= 11.59) {
				System.out.printf(" Bom dia! \n são %.2f da Manhã ", hora);
			} else if (hora <= 12 && hora >= 17.59) {
				System.out.printf("Boa Tarde! \n são %.2f da Tarde", hora);
			} else if (hora >= 18 && hora <= 23.00) {
				System.out.printf("Boa Noite! \n são %.2f da Moite", hora);
			}
		} else {
			System.out.println(" Hora inválida ");
		}
	}
}
