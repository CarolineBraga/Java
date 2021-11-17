package lista7;

public class ContaEspecial extends Conta {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite (double limite) {
		this.limite = limite;
	}
	
	public void sacar (double valor) {
		
		try {
			
			Transacao transacao = new Transacao (ETipoTransacao.DEBITO, valor);
			if (getSaldo() + getLimite() < transacao.getValor())
				throw new Excecao("Erro, não existe saldo suficiente para sacar");
			getTransacoes().add(transacao);
			
		}
		catch (Excecao e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
