package lista5;

import java.util.Date;

public class Operacao {

	private final TipoOperacao tipo;
	private final Date data;
	private final double valor;
	
	public Operacao (TipoOperacao tipo, double valor) {
		
		this.tipo = tipo;
		this.valor = valor;
		this.data = new Date();
	}
	
	public double getValor() {
		return valor;
	}
	
	public Date getData() {
		return data;
	}
	
	public TipoOperacao getTipo() {
		return tipo;
	}
	
}