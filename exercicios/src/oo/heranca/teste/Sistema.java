package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Sistema {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(400);
		Civic  civic = new Civic();
		
		System.out.println("A ferrari est� a => " + ferrari.velocidadeAtual + " km/h");
		System.out.println("O Civic est� a => " + civic.velocidadeAtual + " km/h");
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.acelerar();
		
		
		System.out.println("A ferrari est� a => " + ferrari.velocidadeAtual + " km/h");
		System.out.println("O Civic est� a => " + civic.velocidadeAtual + " km/h");
		System.out.println(ferrari.velocidadeDoAr());
	}
}
