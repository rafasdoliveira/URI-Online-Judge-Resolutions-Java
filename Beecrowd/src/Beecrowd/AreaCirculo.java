//Area do Circulo

package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor:");
		Double raio = input.nextDouble();
		
		Double pi = 3.14159;
		Double area = pi * Math.pow(raio, 2);
		
		input.close();
		
		BigDecimal A = new BigDecimal(area).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("A area do circulo é: "  + A);
	}

}
