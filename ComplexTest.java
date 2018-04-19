public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex(10.5, 7.9);
		Complex c2 = new Complex(4.6, 3.7);

		Complex sum = c1.add(c2);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(sum);
	}
}