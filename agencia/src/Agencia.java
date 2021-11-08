package lista5;

import java.util.ArrayList;

public class Agencia {

	private final int numero;
	private long telefone;
	private Gerente gerente;
	
	ArrayList<Conta> listaContas = new ArrayList<Conta> ();
	
	public Agencia (int numero) {
		this.numero = numero;
	}
	
	public long getTelefone() {
		return telefone;
	}

	public void setTelefone (long telefone) {
		this.telefone = telefone;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente (Gerente gerente) {
		this.gerente = gerente;
	}

	public int getNumero() {
		return numero;
	}
	
	public Conta abrirConta (Cliente titular) {
		
		Conta conta = new Conta (titular);
		listaContas.add(conta);
		
		return conta;
	}
	
	public double getSaldoAgencia() {
		
		double saldoAgencia = 0;
		
		for (Conta conta : listaContas)
			saldoAgencia += conta.getSaldo();
		return saldoAgencia;
	}
}
