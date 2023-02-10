//Produto simples (valores inteiros)

package Beecrowd;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int A = input.nextInt();
		System.out.println("Informe o segundo valor");
		int B = input.nextInt();
		
		int produto = A * B;
		System.out.println("O produto dos valores é: " + produto);
		
		input.close();
	}

}
