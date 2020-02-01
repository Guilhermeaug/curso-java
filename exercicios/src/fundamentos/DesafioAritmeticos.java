package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int a = (int) ((Math.pow(((3 + 2) * 6 ), 2)) / (3 * 2));
		int b = (int) (Math.pow(((1 - 5) * (2 - 7)) / 2, 2));
		int c = (int) Math.pow((a - b), 3);
		int d = (int) (c / Math.pow(10, 3));
		System.out.println(d);
		
		
	}
}
