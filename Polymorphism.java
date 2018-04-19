public class Polymorphism {
	public static void main(String[] args) {
		Polymorphism t = new Polymorphism();
		//toDo(t);
	}
	
	public static void toDo(Polymorphism p) {
		System.out.println(p.sum(5, 8));
		System.out.println(sum(5, 8, 5));
	}
	
	public long sum(long x, int y) {
		return x + y;
	}
	
	public static long sum(int x, int y, int z) {
		return x + y + z;
	}
}