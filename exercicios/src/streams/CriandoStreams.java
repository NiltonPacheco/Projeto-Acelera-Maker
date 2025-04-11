package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;  //definir um print geral para n escrever tanto
		@SuppressWarnings("unused")
		Stream<String> langs = Stream.of("Java ", "Lua "," js\n"); // criando a stream
		String [] maisLangs = { "Python ", "Lisp ", "Perl\n"}; // criando uma string
		Stream.of(maisLangs).forEach(print); // print com stream
		Arrays.stream(maisLangs).forEach(print); // print com arrays
		Arrays.stream(maisLangs, 1,2).forEach(print); // printa do indice 1 até o 2 (n printando o 2)
		List<String>outraLang = Arrays.asList("c "," java "); // criação da lista
		outraLang.parallelStream().forEach(print); // imprime de forma aleatoria
	}
}
