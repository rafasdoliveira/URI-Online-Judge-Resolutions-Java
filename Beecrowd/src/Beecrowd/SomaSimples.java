//Soma Simples (valores inteiros)

package Beecrowd;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int A = input.nextInt();
		System.out.println("Informe o segundo valor");
		int B = input.nextInt();
		
		int soma = A + B;
		System.out.println("A soma dos valores é: " + soma);
		
		input.close();
	}
}	
