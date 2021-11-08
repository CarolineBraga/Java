/*	Tabuada.java
	Programa que mostra a tabuada do número inserido
	Autora: Caroline Braga
*/

import java.util.Scanner;

public class Tabuada {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira o numero:");
		int num = input.nextInt();
		
		input.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, i*num);
		}
		
	} // fim do método main
} // fim da classe Tabuada
