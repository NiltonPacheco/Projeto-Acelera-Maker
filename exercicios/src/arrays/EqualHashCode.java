package arrays;

public class EqualHashCode {
	public static void main(String[] args) {
		Usuario p1 = new Usuario("nirto", "nirto@gmail.com");
		Usuario p2 = new Usuario ("nirto","nirtinho@outlook.com");
		System.out.println(p1.equals(p2));
		System.out.println(p1.nome.equals(p2.nome));
	}
}
