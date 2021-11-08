/*	Triangulo.java
	Programa que mostra se os lados informados formam um triângulo
	Autora: Caroline Braga
*/

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int l1, l2, l3;
		
		System.out.println("Insira o tamanho dos lados do possivel triangulo:");
		
		l1 = input.nextInt();
        input.nextLine();
        
        l2 = input.nextInt();
        input.nextLine();
        
        l3 = input.nextInt();
        
        input.close();
        
        if (l1 < l2 + l3) {
            if (l2 < l1 + l3) {
                if (l3 < l1 + l2) {
                    System.out.println("É um triângulo");
                }
                else {
                    System.out.println("Não é um triângulo");
                }
            }
            else {
                System.out.println("Não é um triângulo");
            }
        }
        else {
            System.out.println("Não é um triângulo");
        }
	} // fim do método main
} // fim da classe Triangulo
