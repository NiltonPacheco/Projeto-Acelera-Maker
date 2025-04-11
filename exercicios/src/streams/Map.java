package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out ::println; // criei metodo para printar
		List<String> marcas = Arrays.asList("fiat ", "bmw ", "porsche "); // criei uma list
		marcas.stream().map(m->m.toUpperCase()).forEach(print); // usando map botei tudo em CAPS
		// UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n-> n.charAt(0) + ""; // pegar primeiro char
		// UnaryOperator<String> grito = n -> n +"!!!";
		System.out.println("\n\nUsando composiçao");
		marcas.stream().map(Utilitario.maiuscula).map(primeiraLetra).map(Utilitario::grito).forEach(print); // printando tudo junto
		 
	}

}
