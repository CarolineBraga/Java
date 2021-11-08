package modelo;

public class ItemPedido {

	private int quantidade;
	private double preco;
	private Produto produto;
	
	public ItemPedido (Produto produto, int quantidade) {
		
		this.produto = produto;
		this.setQuantidade(quantidade);
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public double getTotalItem() {
		
		double total = 0;
		total += getQuantidade() * produto.getPreco();
		return total;
	}
	
	public String getLinhaPedido() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\nCodBarras: " + produto.getCodBarras());
		sb.append("\nProduto: " + produto.getNome());
		sb.append("\nQuantidade: " + getQuantidade());
		sb.append("\nPreco unitario: " + produto.getPreco());
		sb.append("\nValor total: " + getTotalItem());
		
		return sb.toString();
	}
}
