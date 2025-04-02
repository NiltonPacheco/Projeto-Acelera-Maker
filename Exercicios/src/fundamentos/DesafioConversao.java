package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		String valor1 = scanner.next().replace(",", ".");

		System.out.print("Digite o segundo valor: ");
		String valor2 = scanner.next().replace(",", ".");

		System.out.print("Digite o terceiro valor: ");
		String valor3 = scanner.next().replace(",", ".");

		// Convertendo para double
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double num3 = Double.parseDouble(valor3);

		// Calculando a média
		double media = (num1 + num2 + num3) / 3;

		System.out.printf("A média é: %.2f%n", media);

		scanner.close();
	}
}
