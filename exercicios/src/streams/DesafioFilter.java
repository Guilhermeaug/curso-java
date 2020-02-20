package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("Notebook", 3000.95, 0.35, 40));
		produtos.add(new Produto("Caneta", 8.45, 0.10, 0));
		produtos.add(new Produto("GPU", 1200, 0.40, 0));
		produtos.add(new Produto("Estojo", 20.95, 0.50, 0));
		produtos.add(new Produto("Kindle", 255, 0.3, 0));
		
		Predicate<Produto> testaDesconto = p -> p.desconto >= 0.3;
		Predicate<Produto> testaFrete = p -> p.frete == 0;
		Function<Produto, String> selecionado = 
				p -> "O produto " + p.nome + " esta custando apenas R$ " + 
				(p.preco * (1 - p.desconto)) + " e esta com frete gratis!";
		
		
		produtos.stream()
			.filter(testaDesconto)
			.filter(testaFrete)
			.map(selecionado)
			.forEach(System.out::println);
	}
}
