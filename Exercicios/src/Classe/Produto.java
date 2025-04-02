package Classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.2;
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	double desfinal (){
		return preco * (1 - desconto);
	}
	double desfinal (double desfinalgerente) {
		return preco * (1 - (desconto + desfinalgerente));
	}
}
