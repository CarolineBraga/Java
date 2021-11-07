package model;

import java.io.Serializable;

public abstract class Pessoa implements IPessoa, Serializable {

	private static final long serialVersionUID = -5408063123431693782L;
	
	private final long cpf;
	private String nome;
	private String email;
	private long telefone;
	private Endereco endereco;

	public Pessoa (long cpf, String nome, long telefone, Endereco endereco) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public long getTelefone() {
		return telefone;
	}
	
	public long getCpf() {
		return cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEmail(String email) throws EmailException {
		
		boolean emailValido;
				
		emailValido = ValidarEmail.validarEmail(email);
		
		if (emailValido == false) throw new EmailException ("Email invalido");
		
		this.email = email;

	}

	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}

	public void setTelefone (long telefone) {
		this.telefone = telefone;
	}

}