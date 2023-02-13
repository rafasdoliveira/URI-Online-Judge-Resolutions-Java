//Esfera

package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o valor do raio");
		double raio = input.nextDouble();
		double pi = 3.14159;
		
		double volume = (4.0/3) * pi * Math.pow(raio, 3);
		
		BigDecimal volume3 = new BigDecimal(volume).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("VOLUME = " + volume3);

		input.close();	
		}

}
