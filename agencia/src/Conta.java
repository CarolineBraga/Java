package lista5;

import java.util.ArrayList;
import java.util.Date;

public class Conta {

	private static int contador = 1;
	
	private final int numero;
	private Date dataAbertura = new Date();
	private Cliente titular;
	private double saldo = 0;
	
	private ArrayList<Operacao> listaOperacoes = new ArrayList<Operacao> ();
	
	public Conta (Cliente titular) {
		numero = contador++;
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public void depositar (double valor) {
		
		Operacao op = new Operacao (TipoOperacao.CREDITO, valor);
		
		listaOperacoes.add(op);
		saldo += valor;
	}

	public boolean sacar (double valor) {
		
		Operacao op = new Operacao (TipoOperacao.DEBITO, valor);
		
		if (saldo >= valor) {
			saldo -= valor;
			listaOperacoes.add(op);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getTotalCredito() {
		
		double totalCredito = 0;
		for (Operacao op : listaOperacoes) {
			if (op.getTipo() == TipoOperacao.CREDITO)
				totalCredito += op.getValor();
		}
		return totalCredito;
	}
	
	public double getTotalDebito() {
		
		double totalDebito = 0;
		for (Operacao op : listaOperacoes) {
			if (op.getTipo() == TipoOperacao.DEBITO)
				totalDebito += op.getValor();
		}
		return totalDebito;
	}
	
	public String listarExtrato() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nNome do cliente: " + titular.getNome());
		sb.append("\nCPF: " + titular.getCpf());
		sb.append("\nNumero da conta: " + getNumero());
		sb.append("\nTotal Credito: " + getTotalCredito());
		sb.append("\nTotal Debito: " + getTotalDebito());
		sb.append("\nSaldo: " + getSaldo());
		
		for (Operacao op : listaOperacoes) {
			sb.append("\n\nOperacao: " + op.getTipo());
			sb.append("\nValor: " + op.getValor());
			sb.append("\nData: " + op.getData());
		}
		return sb.toString();
	}
}
