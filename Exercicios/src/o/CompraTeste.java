package o;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra ();
		c1.Cliente = "nirto";
		c1.itens.add(new Item("caneta", 2, 3.50));
		c1.itens.add(new Item("borracha", 1, 5));
		c1.itens.add(new Item("caderno", 2, 20.50));
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
		
	}
}
