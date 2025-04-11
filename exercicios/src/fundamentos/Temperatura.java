package fundamentos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite a temp: ");
		int tempf = scanner.nextInt();
		double tempc;
		tempc = (tempf - 32) * 5/9.0;
		System.out.println(tempc);
		scanner.close();
	}
}
