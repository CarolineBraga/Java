package lista7;

public class Cliente implements ICliente {

	private final long cpf;
	private final String nome;
	private String telefone;
	private String email;
	private Endereco endereco;

	private Cliente (Builder builder) {
		
		this.cpf = builder.cpf;
		this.nome = builder.nome;
		this.telefone = builder.telefone;
		this.email = builder.email;
		this.endereco = builder.endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}

	public void setEmail (String email) {
		this.email = email;
	}

	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}

	public static class Builder {
		
		private final long cpf;
		private final String nome;
		private String telefone;
		private String email;
		private Endereco endereco;
		
		public Builder (long cpf, String nome) {
			this.cpf = cpf;
			this.nome = nome;
		}
		
		public Builder telefone (String telefone) {
			this.telefone = telefone;
			return this;
		}
		
		public Builder email (String email) {
			this.email = email;
			return this;
		}
		
		public Builder endereco (Endereco endereco) {
			this.endereco = endereco;
			return this;
		}
		
		public Cliente build() {
			
			return new Cliente(this);
			
		}
	}
	
}