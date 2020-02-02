package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		/*
		 * A partir do produto calcular o preco real
		 * Imposto municipal: >= 2500 (8,5%)/ < 2500 (isento)
		 * frete: >= 3000 (100) / < 3000 (50)
		 * arredondar: deixar duas casas decimais
		 * formatar: R$1234,56
		 */
		
		/*BinaryOperator<Double> calculaPreco = (preco, desconto) -> preco * (1 - desconto);
		UnaryOperator<Double> calculaImposto = preco -> preco >= 2500.0 ? (preco * 0.915) : preco;
		UnaryOperator<Double> calculaFrete = preco -> preco >= 3000 ? 100.0 : 50.0;
		
		double precoReal = calculaPreco.apply(p.preco, p.desconto);
		double impostoMunicipal = calculaImposto.apply(precoReal);
		double frete = calculaFrete.apply(precoReal);
		precoReal += impostoMunicipal + frete;
		*/
		
		Function<Produto, Double> precoFinal = 
				p -> p.preco * (1 - p.desconto);
		
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
				
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preco final é " + preco);
		
		
		
		
	}
}
