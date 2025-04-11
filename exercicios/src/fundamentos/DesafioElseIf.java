package fundamentos;

import java.util.Scanner;

public class DesafioElseIf {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.print("Digite um dia da semana ");
	String dia = scanner.next();
	if (dia.equals("domingo")) {
		System.out.println("1");
	}
	// logica está pronta basta aplicar e refinar.
	
	scanner.close();
}
}
