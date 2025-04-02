package fundamentos;

public class DesafioArimetico {
    public static void main(String[] args) {
        // Calculando num1 com a ordem correta de operações
        double num1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);  // Garantindo que a multiplicação de 3 e 2 ocorra primeiro
        
        // Calculando num2 com a ordem correta de operações
        double num2 = Math.pow((1 - 5) * (2 - 7), 2) / 2;
        
        // Subtraindo num1 e num2
        double num3 = num1 - num2;
        
        // Calculando num4, que é num3 ao cubo dividido por 10^3
        double num4 = Math.pow(num3, 3) / Math.pow(10, 3);
        
        // Imprimindo o resultado
        System.out.println(num4);
    }
}
