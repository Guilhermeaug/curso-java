package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e adicionar -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.add("Daniel");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // retorna falso
		System.out.println(fila.element()); // lança exceçao
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila);
	} 
}
