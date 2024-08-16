/* 
Escreva um programa que leia um ano e diga se ele é bissexto ou não.
Um ano é bissexto se ele for divisível por 4, exceto se ele for divisível por 100 e não por 400. 

Ex:
2000 é bissexto. 
2100 não é bissexto.
*/
package decimoTerceiro;

import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o ano e confirme se ele e bissexto\n\rDigite o ano: ");
		int ano = scan.nextInt();

		//resto da divisão por 4 e igual a 00 " % 4 ==0 " 
		// não terminar em 00 e divisivel por 100  " % 100 != 0 
		// e não divisivel por 400 " % 400 == 0

		if (ano % 4 == 0) {
			if (ano % 100 == 0 && ano % 400 != 0) {
				System.out.println(ano + " Não é bissexto");
			} else {
				System.out.println(ano + " É bissexto");
			}
			
		} else {
			System.out.println(ano + " Não é bissexto");
		}

	}
}
