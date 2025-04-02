package o;

public class Carro {
	Motor motor = new Motor ();
	void acelerar () {
		
		motor.fatorInjecao += 0.4;
	}
	void frear () {
		motor.fatorInjecao -= 0.4;
	}
	void ligado () {
		motor.ligado = true;
	}
	void desligar () {
		motor.ligado = false;
	}
}
