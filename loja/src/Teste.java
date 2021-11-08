package modelo;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		
		// Catalogo
		Catalogo c1 = new Catalogo ();
		
		// Categorias
		Categoria cat1 = new Categoria ("Comida");
		Categoria cat2 = new Categoria ("Bebida");
		Categoria cat3 = new Categoria ("Limpeza");
		
		c1.addCategoria(cat1);
		c1.addCategoria(cat2);
		c1.addCategoria(cat3);
		
		// Produtos
		Produto p1 = new Produto (2222, "chocolate", 5.50);
		Produto p2 = new Produto (2255, "biscoito", 4);
		cat1.addProduto(p1);
		cat1.addProduto(p2);
		
		Produto p3 = new Produto (1111, "suco", 3.50);
		Produto p4 = new Produto (1113, "refrigerante", 6);
		cat2.addProduto(p3);
		cat2.addProduto(p4);
		
		Produto p5 = new Produto (1234, "sabonete", 2);
		Produto p6 = new Produto (1210, "detergente", 2.50);
		cat3.addProduto(p5);
		cat3.addProduto(p6);
		
		// Clientes
		ClientePFisica cl1 = new ClientePFisica ("Maria", "maria_santos@gmail.com", 10302320351L);
		cl1.setTelefone(33456109);
		ClientePJuridica cl2 = new ClientePJuridica ("Lojas Ashi", "ashi_2011@gmail.com", 12099546950121L);
		cl2.setTelefone(23690123);
		
		// Pedido
		Pedido ped1 = new Pedido (10, new Date(), cl1);
		ped1.addItem(p1, 2);
		
		System.out.printf("%s", c1.listarCatalogo());
		System.out.printf("%s", cl1.listarCliente());
		System.out.printf("%s", cl2.listarCliente());
		System.out.printf("%s", ped1.listarPedido());

	}

}
