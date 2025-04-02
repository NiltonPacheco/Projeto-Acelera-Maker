package Classe;

public class AreaCirc {
	double raio;
	static double pi = 3.14;
	
	AreaCirc (double raioInicial){
		raio = raioInicial;
	}
	public double area () {
		return raio * raio * pi;
	}
}
