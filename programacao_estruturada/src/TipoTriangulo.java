/*	TipoTriangulo.java
	Programa que mostra qual é o tipo de triângulo (se realmente for um triângulo)
	Autora: Caroline Braga
*/

import java.util.Scanner;

public class TipoTriangulo {
	
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
        
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
            if (l1 == l2) {
                if (l1 == l3) {
                    System.out.println("É um triângulo equilátero");
                }
                else {
                    System.out.println("É um triângulo isósceles");
                }
            }
            else if (l2 == l3) {
                System.out.println("É um triângulo isósceles");
            }
            else {
                System.out.println("É um triângulo escaleno");
            }
        }
        else {
            System.out.println("Não é um triângulo");
        }
        
	} // fim do método main
} // fim da classe TipoTriangulo
