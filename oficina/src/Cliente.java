package model;

public class Cliente extends Pessoa implements ICliente {
	
	private static final long serialVersionUID = 78656756476565L;

	private boolean platinum = false;
	
	public Cliente(long cpf, String nome, long telefone, Endereco endereco) {
		super(cpf, nome, telefone, endereco);
	}

	public void setPlatinum(boolean platinum) {
		this.platinum = platinum;
	}

	public boolean isPlatinum() {
		return platinum;
	}

}
