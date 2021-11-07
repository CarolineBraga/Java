package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Categoria implements Serializable {
	
	private static final long serialVersionUID = -3930186767574003475L;

	private final String nome;
	
	private ArrayList<IItem> itens = new ArrayList<IItem> ();
	
	public Categoria (String nome) {
		
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void addItem (IItem item) {
		itens.add(item);
	}
	
	public void removeItem (IItem item) {
		itens.remove(item);
	}
	
	public String listarItens() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nCategoria: " + getNome());
		
		for (IItem item : itens) {
			
			sb.append("\nCodigo: " + item.getCodigo());
			sb.append(" Tipo: " + item.getTipo());
			sb.append(" Descricao: " + item.getDescricao());
			sb.append(" Preco: " + item.getPreco());
			
		}
		
		return sb.toString();
		
	}
}
