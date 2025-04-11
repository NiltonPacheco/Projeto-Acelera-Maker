package heranca.desafio;

public class Carro {
  int velocidade =0;
  
  boolean acelerar (Carro acelera) {
	  int acelerar = 5;
	  velocidade = acelerar + velocidade;
	  return true;
  }
  boolean frear (Carro freia) {
	  int freiar = -5;
	  if (velocidade != 0 && velocidade > 0) {
		  velocidade += freiar;
		  return true;
	  }
	  else {
		  System.out.println("Velocidade invalida");
		  return true;
	  }
  }

}
