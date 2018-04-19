public class BitwiseOp {
	public static void main(String[] args) {
		byte x = 0b1010;
		byte y = 0b0101;
		byte z;

		System.out.println("X = " + x + " and Y = " + y);

		z =(byte) (x & y);
		System.out.println("x & y = " + z);

		z =(byte) (x | y);
		System.out.println("x | y = " + z);

		z =(byte) (x ^ y);
		System.out.println("x ^ y = " + z);
		
		x|=~(1<<x);
		System.out.println("~x = " +(byte) x);
		y|=~(1>>y);
		System.out.println("~y = " +(byte) y);
	}
}

int x = 0b1010;
int y = x >> 2
