package lambda;

import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.print(p.nome); 
		Produto p1 = new Produto("caneta", 20, 0.3);
		imprimir.accept(p1);
	}
}
