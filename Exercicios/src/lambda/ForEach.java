package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
public static void main(String[] args) {
	

	List<String> aprovados = Arrays.asList("nirto", "nati");
	System.out.println("Print convencional");
	for (String nome : aprovados) {
		System.out.println(nome);
	}

	System.out.println("Forma com lambda #01");
	aprovados.forEach(nome -> System.out.println(nome));

	System.out.println("Method reference");




}	



}
