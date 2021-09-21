package estruturacondicional;

import java.util.Scanner;

public class Cond01 {

	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.println("Informe o número");
		
		N = sc.nextInt();
		
		if(N < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÂO NEGATIVO");
		}
		sc.close();
	}
	
}
