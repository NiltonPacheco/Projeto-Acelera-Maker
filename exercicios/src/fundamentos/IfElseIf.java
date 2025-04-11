package fundamentos;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Lança a nota bb ");
		double nota = scanner.nextDouble();
		if (nota<6.9) {
			System.out.println("BURRO REPROVADO, CONCEITO F DE FUDIDO");
		}
		else if (nota>= 7 && nota<8) {
			System.out.println("Parabens amigo aprovado, conceito b  de bundao");
		}
		else if (nota>=8 && nota<=10) {
			System.out.println("Parabens friend aprovado, conceito A de Alto");
		}
		else {
			System.out.println("Mentiroso CANALHA MORRA!");
		}
		scanner.close();
		
	}
}
