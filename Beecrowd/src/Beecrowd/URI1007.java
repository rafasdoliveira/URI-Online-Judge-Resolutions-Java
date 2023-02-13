//Diferenca

package Beecrowd;

import java.util.Scanner;

public class URI1007 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int A = input.nextInt();
		System.out.println("Informe o segundo valor: ");
		int B = input.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int C = input.nextInt();
		System.out.println("Informe o quarto valor: ");
		int D = input.nextInt();

		int diferenca = (A * B - C * D);
		System.out.println("DIFERENCA: " + diferenca);
	
		input.close();
	}
}
