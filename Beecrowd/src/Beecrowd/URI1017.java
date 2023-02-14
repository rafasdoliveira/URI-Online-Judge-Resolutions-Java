package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Tempo");
		double tempo = input.nextDouble();
		System.out.println("Velocidade");
		double velocidade = input.nextDouble();
		int kml = 12;
		
		double lit = (tempo * velocidade) / kml;
		
		BigDecimal litros = new BigDecimal(lit).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println(litros);
		
		input.close();
	}
}
