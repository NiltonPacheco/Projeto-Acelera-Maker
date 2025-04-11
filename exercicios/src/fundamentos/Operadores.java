package fundamentos;

public class Operadores {
	public static void main(String[] args) {
		boolean terca = true;
		boolean quinta = false;
		

		System.out.println((terca || quinta) + " sorvetinho galeris");
		System.out.println("comprou tv de 50? " + (terca && quinta));
		System.out.println("comprou de 32? " + (terca || quinta));
	}
}
