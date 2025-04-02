package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario ("Pizza")); 
		Usuario l1 = new Usuario ("frango");
		lista.add(l1);
		System.out.println(lista.get(1).nome);
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}
