//O Maior

package Beecrowd;

import java.util.Scanner;

public class URI1013 {
	
	public static void main(String[] args) {
		
		System.out.println("Informe os valores de A, B e C");
		Scanner input = new Scanner(System.in);
		String valores = input.nextLine();
		
		String[] num = valores.split(" ");
		
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);
		int C = Integer.parseInt(num[2]);
	
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
		System.out.println(maiorABC + " é o maior");
		
		
		input.close();
	}
}
