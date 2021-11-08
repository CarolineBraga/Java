package modelo;

import java.util.ArrayList;

public class Catalogo {

	private ArrayList<Categoria> categorias = new ArrayList<Categoria> ();
	
	public void addCategoria (Categoria categoria) {
		categorias.add(categoria);
	}
	
	public void removeCategoria (Categoria categoria) {
		categorias.remove(categoria);
	}
	
	public String listarCatalogo() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Categoria categoria : categorias)
			sb.append(categoria.listarCategoria());
		
		return sb.toString();
	}
}