package arrays;

import java.util.Scanner;

public class Matriz {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	int total = 0;
	System.out.print("Quantidade de alunos: ");
	int tamanhoAlunos = scanner.nextInt();
	System.out.print("Quantidade de notas: ");
	int qntdNotas = scanner.nextInt();
	double [] [] notasTurma = new double [tamanhoAlunos] [qntdNotas];
	for(int i=0; i< notasTurma.length;i++) {
		for (int j=0;j<qntdNotas; j++) {
			System.out.printf("Informe a nota %d do aluno %d: ",i+1,j+1);
			notasTurma [i] [j] = scanner.nextDouble();
			total+= notasTurma[i][j];
		}
		
	}
	double media = total / (tamanhoAlunos * qntdNotas);
	System.out.println("media da turma" + media);
	scanner.close();
}
}
