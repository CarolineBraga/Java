package modelo;

import java.util.ArrayList;

public class Categoria {

	private String nome;
	protected ArrayList<Produto> produtos = new ArrayList<Produto> ();
	
	public Categoria (String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void addProduto (Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto (Produto produto) {
		produtos.remove(produto);
	}
	
	public String listarCategoria() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\nCategoria: " + nome);
		for (Produto produto : produtos)
			sb.append("\n" + produto.getNome());
		
		return sb.toString();
	}
}