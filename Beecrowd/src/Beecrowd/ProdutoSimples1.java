//Produto Simples 1

package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ProdutoSimples1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual código da peça que você está comprando?");
		int cod1 = input.nextInt();
		System.out.println("Quantas peças você está comprando?");
		int pecas1 = input.nextInt();
		System.out.println("Qual valor das peças você está comprando?");
		double valor1 = input.nextDouble();
			
		double valorFinal = pecas1 * valor1;
		BigDecimal valor = new BigDecimal(valorFinal).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("O produto de codigo "+ cod1 + "custa " + valor1 + ". O valor total da sua compra é de " + valor);
		
		
		input.close();
	}

}
