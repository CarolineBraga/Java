package lista7;

import java.util.Date;

public class Transacao {

	private final ETipoTransacao tipo;
	private final Date data;
	private final Double valor;
	
	public Transacao(ETipoTransacao tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
		this.data = new Date();
	}

	public ETipoTransacao getTipo() {
		return tipo;
	}

	public Double getValor() {
		return valor;
	}
	
	public Date getData() {
		return data;
	}
	
}