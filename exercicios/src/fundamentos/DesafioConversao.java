package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario:");
		String a = entrada.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salario:");
		String b = entrada.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salario:");
		String c = entrada.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(a);
		double s2 = Double.parseDouble(b);
		double s3 = Double.parseDouble(c);
		
		System.out.println("Media: " + (s1 + s2 + s3) / 3);

		entrada.close();
	}
}
