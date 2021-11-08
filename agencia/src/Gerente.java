package lista5;

public class Gerente extends Pessoas {

	private int ramal;
	
	public Gerente (String nome, String email) {
		super(nome, email);
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal (int ramal) {
		this.ramal = ramal;
	}

}