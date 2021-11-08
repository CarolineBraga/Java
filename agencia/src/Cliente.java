package lista5;

public class Cliente extends Pessoas {

	private final long cpf;
	private long telefone;
	
	public Cliente (String nome, String email, long cpf) {
		super(nome, email);
		this.cpf = cpf;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone (long telefone) {
		this.telefone = telefone;
	}

	public long getCpf() {
		return cpf;
	}

}
