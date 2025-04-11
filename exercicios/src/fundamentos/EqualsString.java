package fundamentos;

public class EqualsString {
	public static void main(String[] args) {

		String teste1 = "2";
		String teste2 = "2";
		System.out.println(teste1 == teste2);
		String teste3 = new String("2");
		System.out.println(teste3 == teste1);
		System.out.println(teste1.equals(teste3));
	}
}
