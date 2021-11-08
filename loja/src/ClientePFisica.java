package modelo;

public class ClientePFisica extends Cliente {

	private final long cpf;
	
	public ClientePFisica (String nome, String email, long cpf) {
		super(nome, email);
		this.cpf = cpf;
	}

	public long getCPF() {
		return cpf;
	}

	public String getCadastroRFB() {

		String s = String.valueOf(cpf);
		String cadastroRF = s.substring(0, 3).concat(".").concat(s.substring(3, 6)).concat(".").concat(s.substring(6, 9)).concat("-").concat(s.substring(9, 11));
		
		return cadastroRF;
	}
	
}
