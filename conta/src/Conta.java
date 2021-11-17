package lista7;

import java.util.ArrayList;
import java.util.Date;

public class Conta implements IConta {

	private static int contador = 1;
	private final int numero;
	private final Date dataAbertura;
	private ICliente titular;
	
	private ArrayList<Transacao> transacoes = new ArrayList<Transacao> ();

	public Conta() {
		
		this.numero = contador ++;
		this.dataAbertura = new Date();
		
	}

	public int getNumero() {
		return numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public ICliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		
		double saldo = 0;
		
		for (Transacao transacao : transacoes) {
			
			if (transacao.getTipo() == ETipoTransacao.CREDITO) {
				saldo += transacao.getValor();
			}
			else {
				saldo -= transacao.getValor();
			}
		}
		
		return saldo;
	}
	
	public ArrayList<Transacao> getTransacoes() {
		return transacoes;
	}

	public void depositar (double valor) {
		
		Transacao transacao = new Transacao (ETipoTransacao.CREDITO, valor);
		transacoes.add(transacao);
		
	}
	
	public void sacar (double valor) {
		
		try {
			
			Transacao transacao = new Transacao (ETipoTransacao.DEBITO, valor);
			if (getSaldo() < transacao.getValor())
				throw new Excecao("Erro, não existe saldo suficiente para sacar");
			transacoes.add(transacao);
			
		}
		catch (Excecao e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public StringBuilder listarExtrato() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n-----INFORMACOES DO CLIENTE-----");
		sb.append("\nNome do cliente: " + titular.getNome());
		sb.append("\nCPF: " + titular.getCpf());
		sb.append("\nTelefone: " + titular.getTelefone());
		sb.append("\nEmail: " + titular.getEmail());
		sb.append("\n\n-----INFORMACOES DE ENDERECO-----");
		sb.append("\nTipo de endereco: " + titular.getEndereco().getTipo());
		sb.append("\nLogradouro: " + titular.getEndereco().getLogradouro());
		sb.append("\nNumero: " + titular.getEndereco().getNumero());
		sb.append("\nBairro: " + titular.getEndereco().getBairro());
		sb.append("\nCidade: " + titular.getEndereco().getCidade().getNome());
		sb.append("\nEstado: " + titular.getEndereco().getCidade().getSiglaUF());
		
		sb.append("\n\n-----INFORMACOES DA CONTA-----");
		sb.append("\nNumero da conta: " + getNumero());
		sb.append("\nData de abertura: " + getDataAbertura());
		
		sb.append("\n\n-----TRANSACOES-----");
		for (Transacao transacao : getTransacoes()) {
			sb.append("\nTransacao: " + transacao.getTipo());
			sb.append("\nValor: " + transacao.getValor());
			sb.append("\nData: " + transacao.getData());
		}
		
		sb.append("\nSaldo: " + getSaldo());
		
		return sb;
	}
}