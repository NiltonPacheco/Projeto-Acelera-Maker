package fundamentos;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno para ver o conceito adquirido: ");
        double nota = scanner.nextDouble();
        
        int notaArredondada = (int) nota; // Converter para inteiro

        switch (notaArredondada) {
            case 10: case 9:
                System.out.println("Conceito: A");
                break;
            case 8: case 7:
                System.out.println("Conceito: B");
                break;
            case 6: case 5:
                System.out.println("Conceito: C");
                break;
            case 4: case 3:
                System.out.println("Conceito: D");
                break;
            case 2: case 1: case 0:
                System.out.println("Conceito: F");
                break;
            default:
                System.out.println("Nota inválida.");
        }

        scanner.close();
    }
}
