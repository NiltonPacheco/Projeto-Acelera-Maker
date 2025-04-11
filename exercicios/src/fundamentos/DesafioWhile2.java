package fundamentos;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma nota: ");
		double nota = scanner.nextDouble();
		double notas = 0;
		int i = 1;
		while (nota != -1) {
			notas = nota + notas ;
			System.out.print("Digite uma nota: ");
			nota = scanner.nextDouble();
			i++;
			
			
		}
		double media = 0;
		media = notas / i;
		System.out.printf("media %.2f",media);
		scanner.close();
	
	}
}
