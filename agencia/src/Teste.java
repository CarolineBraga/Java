package lista5;

public class Teste {

	public static void main(String[] args) {

		Cliente cl1 = new Cliente ("Maria", "maria_silva@gmail.com", 02262054210);
		cl1.setTelefone(980546788);
		
		Gerente g1 = new Gerente("Caio", "caio_santos@gmail.com");
		g1.setRamal(1);
		
		Agencia a1 = new Agencia (500);
		a1.setTelefone(33022109);
		a1.setGerente(g1);
		a1.abrirConta(cl1);
		
		// Contas
		for (Conta conta : a1.listaContas) {
			conta.depositar(1000);
			conta.sacar(500);
			System.out.printf("%s\n", conta.listarExtrato());
		}

	}

}
