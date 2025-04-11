package lambda;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto) >= 750);
		Produto p1 = new Produto("notebook", 3330, 0.2);
		
		
		System.out.println(isCaro.test(p1));
	}
}
