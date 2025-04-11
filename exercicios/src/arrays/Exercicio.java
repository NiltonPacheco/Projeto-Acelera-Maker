package arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAluno1 = {7.2,7.4, 8};
		double total = 0;
		for (int i=0;i<notasAluno1.length; i++) {
			total +=notasAluno1 [1];
		}
		System.out.printf("%.2f", total / notasAluno1.length);
	}

}
