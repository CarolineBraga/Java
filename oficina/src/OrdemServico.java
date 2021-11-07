package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class OrdemServico implements Serializable {
	
	private static final long serialVersionUID = 84543432657567L;

	private static int contadorNumero = 1;
	
	private final int numero;
	private final Date data = new Date();
	private String descricao;
	private int kmAtual;
	
	private ICliente cliente;
	private final IVeiculo veiculo;
	private IFuncionario consultor;
	
	private ArrayList<ItemOS> itens = new ArrayList<ItemOS> ();
	
	public OrdemServico (IVeiculo veiculo, int kmAtual) {
		
		this.veiculo = veiculo;
		this.kmAtual = kmAtual;
		this.cliente = veiculo.getProprietario();
		numero = contadorNumero++;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}

	public int getKmAtual() {
		return kmAtual;
	}

	public void setKmAtual (int kmAtual) {
		this.kmAtual = kmAtual;
	}
	
	public IVeiculo getVeiculo() {
		return veiculo;
	}

	public ICliente getCliente() {
		return cliente;
	}

	public IFuncionario getConsultor() {
		return consultor;
	}

	public void setConsultor (IFuncionario consultor) {
		this.consultor = consultor;
	}
	
	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public void addItemOS (ItemOS item) {
		itens.add(item);
	}

	public void removeItemOS (ItemOS item) {
		itens.remove(item);
	}
	
	public double getTotalServicos() {
		
		double servicos = 0;
		
		for (ItemOS item : itens) {
			
			if (item.getItem().getTipo() == ETipoItem.SERVICO) {
				servicos += item.getTotalIItem();
			}
		}
		return servicos;
	}
	
	public double getTotalPecas() {
		
		double pecas = 0;
		
		for (ItemOS item : itens) {
			
			if (item.getItem().getTipo() == ETipoItem.PECA) {
				pecas += item.getTotalIItem();
			}			
		}
		return pecas;
	}
	
	public double getTotalOS() {
		
		double valor = 0;
		
		if (cliente.isPlatinum()) {
			valor += getTotalPecas();
		}
		else {
			valor += getTotalServicos() + getTotalPecas();
		}
		return valor;
	}
	
	public String listarOS() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\nINFORMACOES DA ORDEM DE SERVICO");
		sb.append("\nNumero da OS: " + getNumero());
		sb.append("\nData: " + getData());
		
		sb.append("\n\nINFORMACOES DO CLIENTE");
		sb.append("\nNome: " + cliente.getNome());
		sb.append("\nTelefone: " + cliente.getTelefone());
		sb.append("\nE-mail: " + cliente.getEmail());
		
		sb.append("\n\nINFORMACOES DO FUNCIONARIO RESPONSAVEL");
		sb.append("\nNome: " + consultor.getNome());
		sb.append("\nMatricula: " + consultor.getMatricula());
		
		sb.append("\n\nINFORMACOES DO VEICULO");
		sb.append("\nModelo: " + veiculo.getModelo().getNome());
		sb.append("\nAno: " + veiculo.getAno());
		sb.append("\nCor: " + veiculo.getCor());
		sb.append("\nPlaca: " + veiculo.getPlaca());
		
		sb.append("\n\nINFORMACOES DOS ITENS");
		
		for (ItemOS item : itens) {
			
			sb.append("\nTipo: " + item.getItem().getTipo());
			sb.append("\nCodigo: " + item.getItem().getCodigo());
			sb.append("\nDescricao: " + item.getItem().getDescricao());
			sb.append("\nQuantidade: " + item.getQuantidade());
			sb.append("\nPreco: " + item.getPreco());
			
		}
		
		sb.append("\nValor total dos Servicos: " + getTotalServicos());
		sb.append("\nValor total das Pecas: " + getTotalPecas());
		if (cliente.isPlatinum()) {
			sb.append("\nDesconto Platinum: " + getTotalServicos());
		}
		sb.append("\nValor total da OS: " + getTotalOS());
		
		return sb.toString();
		
	}
	
}
