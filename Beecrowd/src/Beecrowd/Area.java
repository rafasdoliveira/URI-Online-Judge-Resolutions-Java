package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		
		System.out.println("Informe os valores de A, B e C");
		Scanner input = new Scanner(System.in);
		String valores = input.nextLine();
		
		String[] num = valores.split(" ");
		double A = Double.parseDouble(num[0]);
		double B = Double.parseDouble(num[1]);
		double C = Double.parseDouble(num[2]);
	
		double triRet = (A * C) / 2;
		double circ = 3.14159 * Math.pow(C, 2);
		double trap = ((A + B) * C) / 2;
		double quad = B * B;
		double ret = A * B;
		
		BigDecimal triangulo = new BigDecimal(triRet).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("TRIANGULO: " + triangulo);
		BigDecimal circulo = new BigDecimal(circ).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("CIRCULO: " + circulo);
		BigDecimal trapezio = new BigDecimal(trap).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("TRAPEZIO: " + trapezio);
		BigDecimal quadrado = new BigDecimal(quad).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("QUADRADO: " + quadrado);
		BigDecimal retangulo = new BigDecimal(ret).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("RETANGULO: " + retangulo);
		
		input.close();
	}
}
