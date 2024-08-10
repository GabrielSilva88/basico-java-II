package segundo;

import java.util.Scanner;

public class ImparParNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		if (numero % 2 !=0 ) {
			System.out.println(numero + "é Impar");
		} else {
			System.out.println(numero + "é Par");
		}
	}
}
