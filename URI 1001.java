/** Extremamente Básico */

import java.io.IOException;
/** Importa a classe Scanner do pacote Java */
import java.util.Scanner;
/** IMPORTANTE: O nome da classe deve ser "Main" para que a sua solução execute */
public class Main {
 
    public static void main(String[] args) throws IOException {
/** É necessário criar um objeto do tipo Scanner que passa como argumento o objeto System.in */
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt(); 
        int b = leitor.nextInt();
        int soma = a + b;
        System.out.println("X = " + soma);
    }
 
}
