package heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 = new Monstro ();
		Heroi j2 = new Heroi ();
		j1.x=10;
		j1.y = 10;
		
		j2.x=10;
		j2.y=11;
		
		System.out.println(j1.vida);
		System.out.println(j2.atacar(j1));
		System.out.println(j1.vida);
		
		
	}
}
