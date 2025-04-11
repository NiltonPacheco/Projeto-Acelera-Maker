package excecao;

public class Causa {
	public static void main(String[] args) {
		metodoA(null);
	}
	static void metodoA (Aluno aluno) {
		metodoB(aluno);
	}
	static void metodoB (Aluno aluno) {
		if (aluno==null) {
			throw new NullPointerException("O aluno está nulo!");
		}
		System.out.println(aluno.nome);
	}
}
