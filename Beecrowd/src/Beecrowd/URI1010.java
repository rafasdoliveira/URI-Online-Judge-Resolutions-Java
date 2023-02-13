//Calculo Simples

package Beecrowd;

import java.util.Scanner;

public class URI1010 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//System.out.println("Quantas peças você vai levar?");
		System.out.println("Informe o código da peça, a quantidade e o valor unitário");
		String numeros = input.nextLine();
		
		String[] num = numeros.split(" ");
		
		int quantidade1 = Integer.parseInt(num[1]);
		double valorUnit1 = Double.parseDouble(num[2]);
		double valorTotal1 = quantidade1 * valorUnit1;
		
		System.out.println("A peça de códgio " + num[0] + " custou R$ " + valorTotal1);
	
		
		
		input.close();
	}
}
