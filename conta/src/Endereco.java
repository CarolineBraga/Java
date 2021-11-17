package lista7;

public class Endereco {

	private ETipoEndereco tipo;
	private String logradouro;
	private int numero;
	private String bairro;
	private Cidade cidade;
	
	public ETipoEndereco getTipo() {
		return tipo;
	}
	
	public void setTipo (ETipoEndereco tipo) {
		this.tipo = tipo;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro (String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade (String nome, String uf) {
		
		Cidade cidade = new Cidade();
		cidade.setNome (nome);
		cidade.setSiglaUF (uf);
		this.cidade = cidade;
		
	}
	
}
