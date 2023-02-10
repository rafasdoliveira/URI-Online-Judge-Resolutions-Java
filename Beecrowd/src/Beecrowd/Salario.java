package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o seu código de funcionario?");
		int cod = input.nextInt();
		System.out.println("Quantas horas você trabalhou?");
		double horas = input.nextDouble();
		System.out.println("Quanto você recebe por hora trabalhada?");
		double valorHora = input.nextDouble();
		
		double salario = horas * valorHora;
		
		BigDecimal salarioA = new BigDecimal(salario).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("O funcionaro com o codigo: " + cod + "irá receber: " + salarioA);
	}

}
