package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguardar(2.3); // double -> Double
		Double coisa = (Double) caixaA.abrir(); // utilizando cast
		System.out.println(coisa );
	}
}
