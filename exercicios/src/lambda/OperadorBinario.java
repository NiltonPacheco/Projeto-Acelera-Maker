package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1,n2) -> (n1 + n2 )/ 2;
		System.out.println(media.apply(7.6, 7.8));
		BiFunction<Double, Double, String> resultado = (n1,n2) -> ((n1+n2) /2) >= 7 ? "Aprovado " : "Reprovado animal";
		System.out.println(resultado.apply(7.6, 5.0));
		BiFunction<Double, Double, String> resultado2 = (n1,n2) -> {
			double notafinal = (n1+n2) /2;
			return notafinal >=7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado2.apply(7.6, 8.9));
	
	
	}
}
