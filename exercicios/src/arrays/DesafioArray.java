package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Quantas notas: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota [%d]: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double d : notas) {
			total += d;
		}
		
		double media = total / notas.length;
		System.out.println("A média é " + media + "!");
		

		entrada.close();

	}
}
