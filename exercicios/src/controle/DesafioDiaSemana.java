package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		// Domingo -> 1
		// Quarta -> 4
		// Ter�a -> 3
		
		System.out.println("Digite o dia da semana: ");
		Scanner entrada = new Scanner(System.in);
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}else if(dia.equalsIgnoreCase("ter�a")) {
			System.out.println("3");
		}
		
		
		
		
		entrada.close();
	}
}
