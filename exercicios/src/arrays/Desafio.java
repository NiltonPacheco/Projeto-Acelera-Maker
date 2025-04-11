package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite a quantidade de notas: ");
		int tamanho = scanner.nextInt();
		double [] notas = new double [tamanho];
		double total = 0;
		for (int i=0; i<tamanho; i++) {
			System.out.printf("Digita a %d nota :",i+1);
			notas [i] = scanner.nextDouble();
			total+= notas [i];
		}
		double media = total / tamanho;
		for (double nota : notas) {
			System.out.println(nota);
		}
		System.out.printf("media final %.2f " ,media);
		
		scanner.close();
		
	}

}
