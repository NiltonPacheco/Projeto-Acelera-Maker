package colecoes;

//import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
	

		//HashSet <String> conjunto = new HashSet<String>();
		SortedSet<String> conjunto = new TreeSet<>();
		conjunto.add("nirto");
		conjunto.add("nati");
		conjunto.add("alice");
		for (String lista : conjunto) {
			System.out.println(lista);
		}

	}
}
