package heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.acelerar(c1);
		System.out.println(c1.velocidade);
		c1.frear(c1);
		c1.frear(c1);
		System.out.println(c1.velocidade);
		
		
	}
}
