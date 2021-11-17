package lista7;

public class Teste {

	public static void main(String[] args) {
		
		// Endereco
		Endereco e1 = new Endereco();
		e1.setTipo(ETipoEndereco.RESIDENCIAL);
		e1.setNumero(123);
		e1.setBairro("Centro");
		e1.setLogradouro("Rua das Flores");
		e1.setCidade("Rio de Janeiro", "RJ");
		
		Endereco e2 = new Endereco();
		e2.setTipo(ETipoEndereco.COMERCIAL);
		e2.setNumero(1500);
		e2.setBairro("Centro");
		e2.setLogradouro("Rua da Quitanda");
		e2.setCidade("Rio de Janeiro", "RJ");
		
		// Cliente
		Cliente maria = new Cliente.Builder(01325312305l, "Maria").telefone("33273567").email("mariasouza@outlook.com.br").endereco(e1).build();
		
		// Conta
		Conta c1 = new Conta();
		c1.setTitular(maria);
		c1.sacar(100); // mostra mensagem de erro pois nao ha saldo
		c1.depositar(200);
		c1.sacar(150); // autoriza o saque pois foi feito deposito
		
		// Conta especial
		ContaEspecial c2 = new ContaEspecial();
		c2.setTitular(maria);
		c2.setLimite(100);
		c2.sacar(50); // autoriza saque pois esta no limite da conta especial
		
		System.out.println(c1.listarExtrato());
		System.out.println(c2.listarExtrato());

	}

}
