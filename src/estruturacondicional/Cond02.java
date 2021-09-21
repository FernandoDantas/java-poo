package estruturacondicional;
import java.util.Scanner;

public class Cond02 {

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número");
		
		int N = sc.nextInt();		
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
	}
}