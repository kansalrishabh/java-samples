public class IntegerLiterals {
	public static void main(String[] args) {
		int x;
		x = 155;	// Decimal
		System.out.println(x);

		x = 0155;	// Octal
		System.out.println(x);

		x = 0X5fa;	// Hexadecimal
		System.out.println(x);

		x = 0b1010;	// Binary Digits, added by Java 7
		System.out.println(x);

		x = 1_55_733; // Number can be separated by _ (underscore character) added in Java 7
		System.out.println(x);

		x = 0b0000_0000_1010;	// Decimal
		System.out.println(x);
	}
}