package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
	int qtd;
	Produto produto;
	
	Item(Produto produto, int quantidade ){
		this.produto = produto;
		this.qtd = quantidade;
	}
}
