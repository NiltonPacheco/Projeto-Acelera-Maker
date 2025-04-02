package Classe;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto ("Viagra", 30);
		
		
		
		double Precofinal = p1.desfinal(0.1);
		Scanner scanner = new Scanner (System.in);
		System.out.println("O produto tem Desconto padrão");
		System.out.println("1 para sim");
		System.out.println("2 para não");
		int i = scanner.nextInt();
		scanner.nextLine();
		if (i == 2) {
			System.out.printf("produto :%s valor antes do desconto %.2f",p1.nome,p1.preco);
			System.out.printf("\nproduto :%s valor final %.2f",p1.nome,p1.desfinal());
		}
		else {
			System.out.printf("produto :%s valor antes do desconto %.2f",p1.nome,p1.preco);
			System.out.printf("\nproduto :%s valor final %.2f",p1.nome,Precofinal);
		}
		
		scanner.close();
	}
}
