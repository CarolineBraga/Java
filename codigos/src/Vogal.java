/*	Vogal.java
	Programa que mostra se o caractere inserido é vogal
	Autora: Caroline Braga
*/

import java.util.Scanner;

public class Vogal {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
		System.out.println("Insira o caractere:");
		
        char c;
        c = input.next().charAt(0);
        
        input.close();
        
        switch (c) {
            case 'a':
                System.out.println("O caractere a é uma vogal");
                break;
            case 'e':
                System.out.println("O caractere e é uma vogal");
                break;
            case 'i':
                System.out.println("O caractere i é uma vogal");
                break;
            case 'o':
                System.out.println("O caractere o é uma vogal");
                break;
            case 'u':
                System.out.println("O caractere u é uma vogal");
                break;
            default:
                System.out.println("O caractere não é uma vogal");
                break;
        }
    } // fim do método main
} // fim da classe Vogal
