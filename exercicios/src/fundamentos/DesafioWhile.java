package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Lança palavra meu rei: ");
	String meme = scanner.next();
	while (!meme.equals("sair")) {
		System.out.println("Lança palavra meu rei: ");
		meme = scanner.next();

	}
	scanner.close();
}

}
