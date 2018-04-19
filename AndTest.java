public class AndTest {
	static boolean one() {
		System.out.println("one");

		return false;
	}

	static boolean two() {
		System.out.println("two");

		return true;
	}

	public static void main(String[] args) {
		if(one() && two()) {
			System.out.println("check in");
		} else {
			System.out.println("check out");
		}
	}
}