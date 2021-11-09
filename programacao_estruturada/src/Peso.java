/*	Peso.java
	Programa que mostra se a pessoa está no peso ideal ou a quantos quilos dele ela está
	Autora: Caroline Braga
*/

import java.lang.Math;
import java.util.Scanner;

public class Peso {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o nome da pessoa:");
		String nome = input.next();
        input.nextLine();
        
		System.out.println("Digite a altura da pessoa em m:");
		double altura = input.nextDouble();
		input.nextLine();
		
		System.out.println("Digite o sexo da pessoa (M ou F):");
		char sexo = input.next().charAt(0);
		input.nextLine();
		
		System.out.println("Digite o peso da pessoa:");
		double peso = input.nextDouble();
		double peso_ideal;
		
		input.close();

		if (sexo == 'M') {
			peso_ideal = (72.7 * altura) - 58;
		}
		else {
			peso_ideal = (62.1 * altura) - 44.7;
		}
		
		double diferenca = peso_ideal - peso;
		
		if (diferenca == 0) {
			System.out.printf("%s, você está no peso ideal\n", nome);
		}
		else {
			if (diferenca > 0) {
				System.out.printf("%s, você precisa ganhar %f quilos para estar no peso ideal\n", nome, diferenca);
			}
			else {
				System.out.printf("%s, você precisa perder %f quilos para estar no peso ideal\n", nome, Math.abs(diferenca));
			}
		}

	} // fim do método main
} // fim da classe Peso