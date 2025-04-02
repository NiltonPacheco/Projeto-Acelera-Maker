package o;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Nirto");
		Aluno a2 = new Aluno("Alice");
		Aluno a3 = new Aluno("Nati");
		Curso c1 = new Curso ("cc");
		Curso c2 = new Curso ("direito");
		a1.adicionarCurso(c1);
		a2.adicionarCurso(c2);
		a3.adicionarCurso(c2);
		System.out.print( a3.getAluno(c2));
	
	}
}
