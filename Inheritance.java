public class Inheritance {
	public static void main(String[] args) {
		MathOp mo = new MathOp();
		MathPlus mp = new MathPlus();
		System.out.println(mo.sum(5, 10));
		System.out.println(mo.sum(5, 10, 20));
		System.out.println(mp.sum(5, 15));
		System.out.println(mp.sum(5, 15, 25));
	}
}