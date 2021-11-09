/*	Idade.java
	Programa que calcula a idade e mostra se a pessoa pode votar ou obter CNH
	Autora: Caroline Braga
*/

import java.util.Scanner;

public class Idade {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira o ano de nascimento:");
		int nascimento = input.nextInt();
		
		System.out.println("Insira o ano atual:");
		int anoAtual = input.nextInt();
		
		input.close();
		
        int idade;
        
        idade = anoAtual - nascimento;
        
        if (idade >= 16) {
            System.out.println("Já pode votar");
            if (idade >= 18)
                System.out.println("Já pode solicitar carteira de habilitação");
        }
        
	} // fim do método main
} // fim da classe Idade
