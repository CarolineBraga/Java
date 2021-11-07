package model;

import java.io.Serializable;

public class ItemOS implements Serializable {
	
	private static final long serialVersionUID = 144363424677686L;

	private IItem item;
	private int quantidade;
	private double preco;
	
	public ItemOS (IItem item, int quantidade, double preco) {
		
		this.item = item;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public IItem getItem() {
		return item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}
	
	public double getTotalIItem() {
		
		double total = getPreco() * getQuantidade();
		return total;
		
	}

	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public String listarItem() {
		
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n\nCodigo: " + item.getCodigo());
		sb.append("\nTipo: " + item.getTipo());
		sb.append("\nDescricao: " + item.getDescricao());
		sb.append("\nPreco: " + getPreco());
		sb.append("\nQuantidade: " + getQuantidade());
	
		return sb.toString();
	}

}
