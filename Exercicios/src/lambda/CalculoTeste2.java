package lambda;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo c1  = (x,y) -> {
			return x+y;
	};
	System.out.println(c1.executar(2, 3));
	
	c1 = (x,y) -> x + y;
	System.out.println(c1.executar(2, 3));
	System.out.println(Calculo.top());
	System.out.println(c1.t());
	}
}
