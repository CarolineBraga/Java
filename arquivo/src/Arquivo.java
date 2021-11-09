import java.io.*;

public class Arquivo {

	public static void main (String[] args) throws IOException {
		
		PrintWriter saida = new PrintWriter (new File("saida.txt"));
		BufferedReader entrada = new BufferedReader (new FileReader ("entrada.txt"));
	    
	    int caractere = entrada.read();
	    int letras = 0, vogais = 0, consoantes = 0, espacos = 0, palavras = 0, linhas = 0;
	    
	    while ( caractere != -1) {
	    	
	    	if ((caractere >= 65 && caractere <= 90) || (caractere >= 97 && caractere <= 122)) {
	    		
	    		letras++;
	    		
	    		if (caractere == 65 || caractere == 69 || caractere == 73 || caractere == 79 || caractere == 85 || caractere == 97 || caractere == 101 || caractere == 105 || caractere == 111 || caractere == 117) {
	    			vogais++;
	    		}
	    		
	    		else {
	    			consoantes++;
	    		}
	    	}
	    	
	    	else {
	    		
	    		palavras++;
	    		
	    		if (caractere == 10) {
	    			linhas++;
	    		}
	    		
	    		else if (caractere == 32) {
	    			espacos++;
	    		}
	    	}
	    	caractere = entrada.read();
	    }
	    entrada.close();
	    
	    saida.printf("Letras: %d\nVogais: %d\nConsoantes: %d\nEspacos: %d\nPalavras: %d\nLinhas: %d\n", letras, vogais, consoantes, espacos, palavras, linhas);
	    saida.close();
	}
}
