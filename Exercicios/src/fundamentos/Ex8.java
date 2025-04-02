package fundamentos;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int j[] = new int[10]; // Inicializa o array com 10 posições

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            j[i] = scanner.nextInt(); // Lê o número e armazena no array
            if (valor < j[i]) { // Atualiza 'valor' se o novo número for maior
                valor = j[i];
            }
        }

        System.out.println("O maior número digitado foi: " + valor);
        scanner.close();
    }
}
