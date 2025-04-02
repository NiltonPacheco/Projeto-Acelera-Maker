package o;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro ();
		c.ligado();
		System.out.println(c.motor.giros());
		c.acelerar();
		c.acelerar();
		System.out.println(c.motor.giros());
	}
}
