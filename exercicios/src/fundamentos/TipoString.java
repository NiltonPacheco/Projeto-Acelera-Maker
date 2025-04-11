package fundamentos;

import java.util.Scanner;

public class TipoString {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual sua idade: ");
		int idade = entrada.nextInt();
		System.out.print("Qual seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Qual seu sobrenome: ");
		String sobre = entrada.nextLine();
		System.out.printf("seu nome é %s %s e voce tem %d anos", nome, sobre, idade);

		entrada.close();
	}
}
