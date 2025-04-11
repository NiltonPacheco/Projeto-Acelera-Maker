package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		Caixa <String> caixaA = new Caixa <>();
		caixaA.aguardar("segredo!");
		System.out.println(caixaA.abrir());
		Caixa <Double> caixab = new Caixa <>();
		caixab.aguardar(7.8);
		System.out.println(caixab.abrir());
	}
}
