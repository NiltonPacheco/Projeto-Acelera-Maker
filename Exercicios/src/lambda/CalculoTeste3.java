package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
	
	BinaryOperator<Double> c1  = (x,y) -> {
		return x+y;
};
	System.out.println(c1.apply(2.0, 3.0));
	
	}
}
