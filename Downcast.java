public class Downcast {
	public static void main(String[] args) {
		Useful u1 = new Useful();
		Useful u2 = new MoreUseful();

		u1.g();
		u2.g();
		u1.f();
		u2.f();
		// MoreUseful: method not found
		// u1.x();
		((MoreUseful) u2).x();	// OK
		((MoreUseful) u1).x();	// runtime exception.	
	}
}