/*Escreva um programa que leia uma letra do alfabeto e diga se ela é uma vogal ou uma consoante. 
	Lembre-se que, na comparação de Strings, usa-se o método .equals() ou o .equalsIgnoreCase().
 */
package sexto;

import java.util.Scanner;

public class VogalConsoante {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Verificar se a letra e Vogal ou Consoante");

		System.out.println("Digite a letra, agora: ");
		String letra = scan.nextLine();

		if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra)
				|| "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
			System.out.println(letra + " é uma vogal");
		} else {
			System.out.println(letra + " é uma Consoante");
		}

		/*
		 * 
		 * 	if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
				}
		 * não funciona com .equals ou equalsIgnoreCase switch (letra) { case
		 * "a, "e", "i", "o", "u" : {
		 * 
		 * System.out.println(letra + " E uma vogal"); break; } default:
		 * System.out.println(letra +" E uma Consoante"); break; }
		 * 
		 */

	}

}
