package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("nirto","nati");
		for(String nomes : aprovados) {
			System.out.println(nomes);
		}
		//Lambda forEach
		aprovados.forEach(nome -> System.out.println (nome));
		//method reference
		aprovados.forEach(System.out::println);
		//lambda #02
		aprovados.forEach(nome -> meuImprimir(nome));
		//method reference #02
		aprovados.forEach(ForEach::meuImprimir);
	
	
	
	}	
	
	
	
	
	
	static void meuImprimir (String nome) {
			System.out.println("oi meu nome é " + nome);
		}
	
	
	
	
}
