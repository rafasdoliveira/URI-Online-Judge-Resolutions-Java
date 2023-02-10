//Media 2

package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		double A = input.nextDouble();
		int pesoA = 2; 
		System.out.println("Informe o segundo valor");
		double B = input.nextDouble();
		int pesoB = 3;
		System.out.println("Informe o terceiro valor");
		double C = input.nextDouble();
		int pesoC = 5;
		
		double media = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / 10;
		BigDecimal mediad = new BigDecimal(media).setScale(1, RoundingMode.HALF_EVEN);
		System.out.println("A media é: " + mediad);
		
		input.close();
		
		
		
	}
}
