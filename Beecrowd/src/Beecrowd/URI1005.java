//Media 1

package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		double A = input.nextDouble();
		double pesoA = 3.5;
		System.out.println("Informe o segundo valor");
		double pesoB = 7.5;
		double B = input.nextDouble();

		double media = ((A * pesoA) + (B * pesoB)) / 11;
		BigDecimal decimal = new BigDecimal(media).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("A media dos valores informado é: " + decimal);
		
		input.close();
	}

}
