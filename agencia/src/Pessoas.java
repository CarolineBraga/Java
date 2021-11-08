package lista5;

public abstract class Pessoas {

	private String nome;
	private String email;
	
	public Pessoas (String nome, String email) {
		
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
	
}