package model;

import java.io.Serializable;

public class Modelo implements Serializable {
	
	private static final long serialVersionUID = 9734523425456L;

	private final String nome;
	
	public Modelo (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}