package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("NIRTO", 7.5);
		Aluno a2 = new Aluno("Nati", 8.5);
		Aluno a3 = new Aluno ("Alice", 6.5);
		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		Predicate<Aluno> aprovado = a-> a.nota>=7;
		Function<Aluno, String> saudacao = a-> "Parabens " + a.nome + " vc foi aprovado!";
		alunos.stream().filter(aprovado).map(saudacao).forEach(System.out::print);
		
		
		//alunos.stream().filter(a-> a.nota >=7).map(a-> "Parabens " + a.nome + " vc foi aprovado! ").forEach(System.out::print);
		//alunos.stream().filter(a-> a.nota <= 7).map(a-> "Infelizmente " + a.nome + " vc foi reprovada! :c ").forEach(System.out::print);
	}
}
