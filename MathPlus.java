public class MathPlus extends MathOp {

	public long sum(long x, int y) {
		long res = x + y;
		System.out.println("Sum of " + x + " and " + y + " is " + res);

		return res;
	}

	public static long sum(int x, int y, int z) {
		long res = x + y + z;
		System.out.println("Sum of " + x + ", " + " and " + y + " is " + res);

		return res;
	}
}