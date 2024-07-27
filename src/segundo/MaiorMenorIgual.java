/* Escreva um programa que leia dois números inteiros do usuário e diga qual é o maior, o menor ou se são iguais.*/

package segundo;

import java.util.Scanner;

public class MaiorMenorIgual {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nUm, nDois;
		
		System.out.println("Verificador de maior, menor ou igual: ");
		
		System.out.println("Digite primeiro número: ");
		nUm = scan.nextInt();
		
		System.out.println("Digite segundo número: ");
		nDois = scan.nextInt();
		
		if(nUm > nDois) {
			System.out.println("Primeiro número Maior que Segundo número");
		}else if(nUm < nDois) {
			System.out.println("Primeiro número Menor que Segundo número");
		}else {
			System.out.println("Primeiro número Igual Segundo número");
		}
	}
	
}
