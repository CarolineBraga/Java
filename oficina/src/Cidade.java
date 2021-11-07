package model;

import java.io.Serializable;

public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 547435442123425L;

	private final String nome;
	private final String UF;

	public Cidade (String nome, String UF) {
		this.nome = nome;
		this.UF = UF;
	}

	public String getNome() {
		return nome;
	}

	public String getUF() {
		return UF;
	}

}
