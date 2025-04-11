package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o Segundo numero");
		double num2 = scanner.nextDouble();
		System.out.println("operador : ");
		String op = scanner.next();
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

		scanner.close();
	}

}
