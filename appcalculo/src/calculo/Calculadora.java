package calculo;



import calculo.interno.OperacoesAritimeticas;

public class Calculadora {
	private OperacoesAritimeticas op = new OperacoesAritimeticas();
	
	public double soma (double... nums) {
		return op.soma(nums);
	}

}
