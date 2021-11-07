package model;

import java.io.Serializable;

public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 2345643654657L;

	private String logradouro;
	private int numero;
	private String bairro;
	private Cidade cidade;
	
	public Endereco (String logradouro, int numero, String bairro, Cidade cidade) {
		
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;

	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setLogradouro (String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero (int numero) {
		this.numero = numero;
	}

	public void setBairro (String bairro) {
		this.bairro = bairro;
	}

	public void setCidade (Cidade cidade) {
		this.cidade = cidade;
	}

}