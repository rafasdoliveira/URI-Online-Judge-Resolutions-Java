//Extremamente Basico

package Beecrowd;

import java.util.Scanner;

public class URI1001 {

	public static void main(String[] args) {
		
		//Java é uma linguagem orientada a objeto, é um modelo de programação onde diversas classes 
		//possuem características que definem um objeto na vida real

		Scanner input = new Scanner(System.in);
		
			int A = input.nextInt();
			int B = input.nextInt();
			int X = A + B;
		//Em linguagens orientadas a objetos, precisamos definir o tipo de variavel,,
		//int para numeros inteiros, String para textos, double/float para numeros com casas decimais, etc		
		System.out.println("X = " + X);
		
		input.close();
			
	
	}

}
