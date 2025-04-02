package o;

import java.util.ArrayList;

public class Curso {
	final ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	final String nome;

	Curso(String nome) {
		this.nome = nome;
	}

	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);

	}

	String getcurso (Aluno aluno){
		
		return "curso" + " " + nome;
	}
}
