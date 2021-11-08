package modelo;

public abstract class Cliente {

	private String nome;
	private String email;
	private long telefone;
	
	public Cliente (String nome, String email) {
		
		this.setNome(nome);
		this.setEmail(email);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public long getTelefone() {
		return telefone;
	}
	
	public void setTelefone (long telefone) {
		this.telefone = telefone;
	}
	
	public abstract String getCadastroRFB();
	
	public String listarCliente() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\nCadastro Receita Federal: " + getCadastroRFB());
		sb.append("\nNome: " + nome);
		sb.append("\nEmail: " + email);
		sb.append("\nTelefone: " + telefone);
		
		return sb.toString();
	}
}
