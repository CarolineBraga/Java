package modelo;

public class ClientePJuridica extends Cliente {

	private final long cnpj;
	private String nomeContato;
	
	public ClientePJuridica (String nome, String email, long cnpj) {
		
		super(nome, email);
		this.cnpj = cnpj;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato (String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public long getCNPJ() {
		return cnpj;
	}
	
	public String getCadastroRFB() {

		String s = String.valueOf(cnpj);
		String cadastroRF = s.substring(0, 2).concat(".").concat(s.substring(2, 5)).concat(".").concat(s.substring(5, 8)).concat("/").concat(s.substring(8, 12)).concat("-").concat(s.substring(12, 14));
		
		return cadastroRF;
	}
}
