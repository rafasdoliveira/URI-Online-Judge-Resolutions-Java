//Cédulas

package Beecrowd;

import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		
		System.out.println("Qual valor você deseja dividir?");
		Scanner input = new Scanner(System.in);
		int valor = input.nextInt();
		
		System.out.println(valor);
		
		//int atual = valor;
		int notas100 = (valor / 100);
		valor -= notas100 * 100;
		
		System.out.println(valor + "");
		
		
		input.close();
	}
}
