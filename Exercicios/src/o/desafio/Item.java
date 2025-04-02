package o.desafio;

public class Item {
	Produto produto;
	int quantidade;
	Item (Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	Produto p1 = new Produto ("Feijao", 2);
}
