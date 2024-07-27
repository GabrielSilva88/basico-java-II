/*  
 	+Faça um programa que leia três notas de um aluno e calcule a média. 

	Se a média for maior ou igual a 7, o aluno está aprovado. 
	Se a média for menor que 4, o aluno está reprovado. 
	
	Se a média estiver entre 4 e 7, o aluno precisa fazer uma prova final.

	O programa deve escrever a situação do aluno, juntamente com sua média.
 */
package terceiro;

import java.util.Scanner;

public class MediaNotaAluno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double media, notaUm, notaDois, notaTres;

		System.out.println("Digite a primiera nota: ");
		notaUm = scan.nextDouble();

		System.out.println("Digite a segunda nota: ");
		notaDois = scan.nextDouble();

		System.out.println("Digite a treceira nota: ");
		notaTres = scan.nextDouble();

		media = (notaUm + notaDois + notaTres) / 3;

		if (media >= 7) {
			System.out.printf("o aluno está aprovado. Sua media é %.2f ", media);
		} else if (media <= 4) {
			System.out.printf("o aluno está reprovado. Sua media é %.2f", media);
		}else {
			System.out.printf("o aluno precisa fazer uma prova final. Sua media é %.2f", media);
		} 
	}
}
