package model;

public class Teste {

	public static void main (String[] args) throws EmailException {
		
		// Itens
		Item pastilha = new Item (ETipoItem.PECA, "Pastilha de freio para gol");
		pastilha.setPreco(150.50);
		
		Item trocapastilha = new Item (ETipoItem.SERVICO, "Servico de troca da pastilha de carro");
		trocapastilha.setPreco (200);
		
		Item bateria = new Item (ETipoItem.PECA, "Bateria nova para carro");
		bateria.setPreco(500);
		
		Item trocabateria = new Item (ETipoItem.SERVICO, "Servico de troca de bateria de carro");
		trocabateria.setPreco(200);
		
		Item pintura = new Item (ETipoItem.SERVICO, "Servico de pintura externa de veiculo");
		pintura.setPreco(1750);
		
		// Categoria
		Categoria manutencao = new Categoria ("Manutencao");
		Categoria personalizacao = new Categoria ("Personalizacao");
		Categoria pecasFreio = new Categoria ("Pecas para freio");
		Categoria pecasBateria = new Categoria ("Pecas para bateria");
		
		manutencao.addItem(trocabateria);
		manutencao.addItem(trocapastilha);
		personalizacao.addItem(pintura);
		pecasFreio.addItem(pastilha);
		pecasBateria.addItem(bateria);
		
		// Printar Catalogo
		System.out.println (manutencao.listarItens());
		System.out.println (personalizacao.listarItens());
		System.out.println (pecasFreio.listarItens());
		System.out.println (pecasBateria.listarItens());
		
		// ItensOS
		ItemOS i1 = new ItemOS (pastilha, 2, 200);
		ItemOS i2 = new ItemOS (trocapastilha, 2, 300);
		ItemOS i3 = new ItemOS (bateria, 1, 500);
		ItemOS i4 = new ItemOS (trocabateria, 1, 250);
		ItemOS i5 = new ItemOS (pintura, 1, 2000);
		System.out.println (i1.listarItem());
		
		// Funcionarios
		Cidade rio = new Cidade ("Rio de Janeiro", "RJ");
		Endereco e3 = new Endereco ("Rua das Flores", 170, "Jardim", rio);
		Funcionario jose = new Funcionario (02262054210l, "Jose", 33273567l, e3);
		
		Cidade caxias = new Cidade ("Duque de Caxias", "RJ");
		Endereco e4 = new Endereco ("Rua das Pedras", 434, "Centro", caxias);
		Funcionario marcia = new Funcionario (02362042152l, "Marcia", 23456789l, e4);
		
		// Cliente Maria
		Cidade petropolis = new Cidade ("Petropolis", "RJ");
		Endereco e1 = new Endereco ("Rua do Imperador", 100, "Centro", petropolis);
		Cliente maria = new Cliente (03322244401l, "Maria", 11325766l, e1);
		maria.setPlatinum (true);
		maria.setEmail ("mariasouza@outlook.com.br");
		
		// Carro da Maria
		Modelo uno = new Modelo ("Fiat Uno");
		Veiculo v1 = new Veiculo (uno, "9BWSU19F08B302158", 2010, "vermelho");
		v1.setProprietario (maria);
		
		// Ordens de servico
		OrdemServico os1 = new OrdemServico (v1, 9000);
		OrdemServico os2 = new OrdemServico (v1, 3000);
		os1.setConsultor (marcia);
		os2.setConsultor (jose);
		
		os1.addItemOS (i3);
		os1.addItemOS (i4);
		os2.addItemOS (i5);
		v1.addOS (os1);
		v1.addOS (os2);
		
		// Cliente Joao
		Endereco e2 = new Endereco ("Rua Primeiro de Marco", 70, "Centro", rio);
		Cliente joao = new Cliente (01325312305l, "Joao", 32445567l, e2);
		joao.setEmail ("joaoahstk@gmail.com");
		
		// Carro Joao
		Modelo gol = new Modelo ("Gol");
		Veiculo v2 = new Veiculo (gol, "5BTSY19K08B983450", 2005, "preto");
		v2.setProprietario (joao);
		v2.setPlaca ("KLP5678");
		
		// Ordens de servico
		OrdemServico os3 = new OrdemServico (v2, 50000);
		os3.setConsultor (marcia);
		
		os3.addItemOS (i1);
		os3.addItemOS (i2);
		v2.addOS (os3);
		
		System.out.println (os1.listarOS());
		System.out.println (os2.listarOS());
		System.out.println (os3.listarOS());
		
	}

}