package fundamentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		// Usando JOptionPane para captura de dados
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");

		// Convertendo de String para double
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);

		// Exibindo os valores
		System.out.printf("Os valores digitados foram: %.2f e %.2f%n", num1, num2);

		// Usando Scanner para captura de dados
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o terceiro numero: ");
		String valor3 = scanner.nextLine();

		System.out.print("Digite o quarto numero: ");
		String valor4 = scanner.nextLine();

		// Convertendo para double
		double num3 = Double.parseDouble(valor3);
		double num4 = Double.parseDouble(valor4);

		// Exibindo os valores
		System.out.printf("Os valores digitados com Scanner foram: %.2f e %.2f%n", num3, num4);

		// Fechando o scanner
		scanner.close();
	}
}
