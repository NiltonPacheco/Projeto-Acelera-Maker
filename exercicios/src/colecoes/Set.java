package colecoes;

import java.util.HashSet;

public class Set {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	HashSet conjunto = new HashSet();
	conjunto.add(1);
	conjunto.add("teste");
	System.out.print("tamanho " + conjunto.size());
}
}
