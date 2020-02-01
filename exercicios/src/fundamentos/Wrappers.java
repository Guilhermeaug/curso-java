package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 100000L;

		System.out.println(b.byteValue());
//		System.out.println(b);
		System.out.println(s.toString());
		System.out.println(i * 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);

	}
}
