package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.123456788888;
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
		
		short h = 1;
		int j = h;
		System.out.println(j);
		
	}
}
