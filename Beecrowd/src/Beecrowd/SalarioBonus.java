package Beecrowd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SalarioBonus {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = input.next();
		System.out.println("Quantos reais em vendas você realizou?");
		double vendas = input.nextDouble();
		double comissao = vendas * 0.15;
		double salario = 1697.50;
		
		double salarioTotal = comissao + salario;
		BigDecimal salariocompleto = new BigDecimal(salarioTotal).setScale(2, RoundingMode.HALF_EVEN);
		
		System.out.println(nome + ", a soma do seu salário com sua comissão é de " + salariocompleto);
		
		input.close();
	}
}
