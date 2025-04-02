package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
	Deque<String> livros = new ArrayDeque<String>()	;
	livros.add("teste");
	livros.add("garoto");
	livros.push("garota");
	System.out.println(livros.peek());
	System.out.println(livros.element());
	System.out.println(livros.pop());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	for (String l : livros ) {
		System.out.println(l);
	}
	
	}
	

}
