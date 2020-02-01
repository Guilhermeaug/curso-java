package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int qtd) {
		this.itens.add(new Item(new Produto(nome, preco), qtd));
	}
	
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.qtd * item.produto.preco;
		}
		
		return total;
	}
}
