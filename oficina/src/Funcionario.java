package model;

public class Funcionario extends Pessoa implements IFuncionario {
	
	private static final long serialVersionUID = 734534523412123300L;

	private static int contadorMatricula = 1;
	private final int matricula;
	
	public Funcionario (long cpf, String nome, long telefone, Endereco endereco) {
		super(cpf, nome, telefone, endereco);
		matricula = contadorMatricula++;
	}

	public int getMatricula() {
		return matricula;
	}

}