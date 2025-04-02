package lambda;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo c1 = new Soma ();
		Calculo c2 = new Multiplicar();
		System.out.println(c1.executar(2, 4));
		System.out.println(c2.executar(2, 4));
		
	}
}
