public class CharLiterals {
	public static void main(String[] args) {
		char c;

		c = 'A';		// Single quote
		System.out.println(c);

		c = 65;		// initializing by using decimal number
		System.out.println(c);

		c = '\122';		// initializing by using octal number
		System.out.println(c);

		c = '\u0022';		// initializing by using hexadecimal number
		System.out.println(c);
	}

}