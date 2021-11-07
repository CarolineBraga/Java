package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Veiculo implements IVeiculo, Serializable {
	
	private static final long serialVersionUID = -43523443354564667L;

	private final Modelo modelo;
	private final String chassi;
	private final int ano;
	private String placa;
	private String cor;
	private ICliente proprietario;
	
	private ArrayList<OrdemServico> servicos = new ArrayList<OrdemServico> ();
	
	public Veiculo (Modelo modelo, String chassi, int ano, String cor) {
		
		this.modelo = modelo;
		this.chassi = chassi;
		this.ano = ano;
		this.cor = cor;

	}

	public String getPlaca() {
		return placa;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public int getAno() {
		return ano;
	}

	public String getCor() {
		return cor;
	}

	public ICliente getProprietario() {
		return proprietario;
	}
	
	public void addOS (OrdemServico ordemServico) {
		servicos.add(ordemServico);
	}

	public void removeOS (OrdemServico ordemServico) {
		servicos.remove(ordemServico);
	}

	public ArrayList<OrdemServico> getServicos() {
		return servicos;
	}
	
	public void setPlaca (String placa) {
		this.placa = placa;
	}

	public void setCor (String cor) {
		this.cor = cor;
	}

	public void setProprietario (ICliente proprietario) {
		this.proprietario = proprietario;
	}

	public String listarServicos() {
		
		StringBuilder sb = new StringBuilder();
		
		for (OrdemServico servico : servicos) {
			sb.append(servico.listarOS());
		}
		
		return sb.toString();
	}
	
}
