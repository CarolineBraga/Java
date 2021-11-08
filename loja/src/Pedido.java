package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private final int numero;
	private Date data;
	private double valorFrete;
	private Cliente cliente;
	private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido> ();

	public Pedido (int numero, Date data, Cliente cliente) {
		
		this.numero = numero;
		this.data = data;
		this.cliente = cliente;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete (double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void addItem (Produto produto, int quantidade) {
		
		ItemPedido item = new ItemPedido(produto, quantidade);
		itens.add(item);
		
	}
	
	public void removeItem (int index) {
		itens.remove(index);
	}
	
	public double getTotalPedido () {
		
		double total = 0;
		
		for (ItemPedido item : itens)
			total += item.getTotalItem();
		total += getValorFrete();
		
		return total;
	}
	
	public String listarPedido() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\nNumero do pedido: " + numero);
		sb.append("\nData do pedido: " + data);
		sb.append("\nValor do pedido: " + getTotalPedido());
		sb.append("\nNome do cliente: " + getCliente().getNome());
		sb.append("\nEmail do cliente: " + getCliente().getEmail());
		sb.append("Telefone do cliente: " + getCliente().getTelefone());
		sb.append("\nItens do pedido:");
		
		for (ItemPedido item : itens)
			sb.append(item.getLinhaPedido());
		
		return sb.toString();
	}
}
