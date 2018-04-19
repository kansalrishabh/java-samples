public class ShiftOp {
	public static void main(String[] args) {
		int x = 0b00000000000000000000000000001010;
		int y = 0b00000000000000000000000000000101;
		int z;

		z = x >> 2;
		System.out.println(z);

		z = x << 2;
		System.out.println(z);

		z = y >>> 2;
		System.out.println(z);

		y = -y;
		z = y >>> 2;
		System.out.println(z);
	}
}