package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
	Queue<String> fila = new LinkedList<> ();
	fila.add("Nirto");
	fila.offer("nati");
	fila.add("Alice");
	fila.offer("Daniel");
	System.out.println(fila.peek()); // retorna null caso a fila esteja vazia
	System.out.println(fila.element()); // da erro caso a fila esteja vazia
	fila.size();
	fila.isEmpty();
	fila.clear();
	System.out.println(fila.remove());// obtem proximo item da fila e remove
	System.out.println(fila.poll()); // obtem proximo item da fila e remove
	 // 
	}
}
