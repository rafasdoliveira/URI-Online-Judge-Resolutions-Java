//Distância

package Beecrowd;

import java.util.Scanner;

public class URI1016 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a distância: ");
		
		int distancia = input.nextInt();
		int minutos = (60 * distancia) / 30;
		
		System.out.println(minutos + " minutos");
		
		input.close();
	}
}
