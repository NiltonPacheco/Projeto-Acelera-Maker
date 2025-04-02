package lambda;
@FunctionalInterface
public interface Calculo {
	public double executar (double a, double b);
	
	default String t() {
		return "3";
	}
	static String top () {
		return "top";
	}
}
