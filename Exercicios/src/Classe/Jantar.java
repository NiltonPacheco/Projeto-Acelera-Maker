package Classe;

public class Jantar {
public static void main(String[] args) {
	Comida c1 = new Comida("feijaummm", 9900);
	Pessoa p = new Pessoa(" GUTO ", 86);
	System.out.println(p.apresentar());
	p.comer(c1);
	System.out.println(p.apresentar() + " MUÇEI GALERIS");
}
}
