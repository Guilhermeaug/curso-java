package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		float total = 0.0f;
		int contador = 0;
		float nota = 0.0f;
		
		while(nota != -1) {
			System.out.print("Digite a nota do aluno " + contador + " :");
			nota = entrada.nextFloat();
			
			if(nota >= 0 && nota <= 10) {
				System.out.println("Nota válida!");
				total += nota;
				contador++;
			}else if(nota == -1){
				System.out.println("Sistema finalizado!");
			}else {
				System.out.println("Nota inválida!");
			}
		}
		
		System.out.println("Media das notas: " + (total / contador));
		
		entrada.close();
		
	}
}
