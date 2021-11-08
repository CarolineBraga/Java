package modelo;

public class Produto {

	private final int codBarras;
	private String nome;
	private double preco;
	private double percDesconto;
	
	public Produto (int codBarras, String nome, double preco) {
		
		this.codBarras = codBarras;
		this.setNome(nome);
		this.setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		double percPreco = (100 - percDesconto)/100;
		preco = percPreco * preco;
		return preco;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public double getPercDesconto() {
		return percDesconto;
	}
	
	public void setPercDesconto (double percDesconto) {
		this.percDesconto = percDesconto;
	}
	
	public int getCodBarras() {
		return codBarras;
	}
	
}
