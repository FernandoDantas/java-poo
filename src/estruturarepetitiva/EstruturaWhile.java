package estruturarepetitiva;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
		
	}
	
}
