/*
 * Escreva um programa que leia o preço de um produto e a forma de pagamento escolhida pelo cliente: 

→ 1 - em espécie
→ 2 - cartão de crédito
→ 3 - cartão de débito 

Mostre o valor final da compra. 

Considere que o produto tem 10% de desconto se for pago em espécie ou no cartão de débito e não tem desconto se for pago no cartão de crédito.
 */

package oitavo;

import java.util.Scanner;

public class FormaPagamento {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double valorProduto = 0, desconto = 0;

		System.out.println("Digite o valor do produto: ");
		valorProduto = scan.nextDouble();

		System.out.println("Escolha a forma de Pagamento: \r\n" + "→ 1 - em espécie\r\n" + "→ 2 - cartão de crédito\r\n"
				+ "→ 3 - cartão de débito \r\n");
		System.out.println("Digite uma Opção: ");
		int formaPag = scan.nextInt();

		switch (formaPag) {
		case 1: 
			desconto = (valorProduto * 10) / 100;
			valorProduto = valorProduto - desconto;
			System.out.println("Forma de Pagamento é Especie, há desconto de 10%, valor do produto: "+ valorProduto);
			break;
		
		case 2: {

			System.out.println("Forma de Pagamento é Crédito, valor do produto: " + valorProduto);
			break;
		}
		case 3: {
			desconto = (valorProduto * 10) / 100;
			valorProduto = valorProduto - desconto;
			System.out.println("Forma de Pagamento é Débito, há desconto de 10%, valor do produto: " + valorProduto);
			break;
		}
		default:
			System.out.println("Não e uma forma de pagamento.");
		}

		// utilizando if else e else if
		/*
		 * if (formaPag == 1) { desconto = (valorProduto * 10) / 100; valorProduto =
		 * valorProduto - desconto; System.out.
		 * println("Forma de Pagamento é Especie, há desconto de 10%, valor do produto: "
		 * + valorProduto); } else if (formaPag == 2) {
		 * System.out.println("Forma de Pagamento é Crédito, valor do produto: " +
		 * valorProduto); } else if (formaPag == 3) { desconto = valorProduto * 10 /
		 * 100; valorProduto = valorProduto - desconto; System.out.
		 * println("Forma de Pagamento é Débito, há desconto de 10%, valor do produto: "
		 * + valorProduto);		
		 * } else {
		 * System.out.println("Não e uma forma de pagamento.");
		 * }
		 */
	}

}
