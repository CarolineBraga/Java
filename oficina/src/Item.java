package model;

import java.io.Serializable;

public class Item implements IItem, Serializable {
	
	private static final long serialVersionUID = 244121124557646L;
	
	private static int contadorCodigo = 1;
	
	private final ETipoItem tipo;
	private final int codigo;
	private final String descricao;
	private double preco;
	
	public Item (ETipoItem tipo, String descricao) {

		this.descricao = descricao;
		this.tipo = tipo;
		codigo = contadorCodigo++;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public ETipoItem getTipo() {
		return tipo;
	}

	public void setPreco (double preco) {
		this.preco = preco;
	}
	
}