//Distancia entre dois pontos

package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe os valores da primeira linha");
		String valores1 = input.nextLine();

		String[] v1 = valores1.split(" ");
		double x1 = Double.parseDouble(v1[0]);
		double y1 = Double.parseDouble(v1[1]);

		System.out.println("Informe os valores da segunda linha");
		String valores2 = input.nextLine();

		String[] v2 = valores2.split(" ");
		double x2 = Double.parseDouble(v2[0]);
		double y2 = Double.parseDouble(v2[1]);
		
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		BigDecimal distancia = new BigDecimal(dist).setScale(4, RoundingMode.HALF_EVEN);
		System.out.println(distancia);
		
		input.close();
	}
}
