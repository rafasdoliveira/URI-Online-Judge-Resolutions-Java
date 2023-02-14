//Consumo

package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1014 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos km você rodou?");
		int km = input.nextInt();
		System.out.println("Quantos litros de combustível você utilizou?");
		double l = input.nextDouble();
		
		double kmli = km / l;
		
		BigDecimal kml = new BigDecimal(kmli).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println(kml + " km/l");

		input.close();
	}
}
