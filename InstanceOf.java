public class InstanceOf {
	public static void main(String[] args) {
		Hathi hathi = new Hathi();

		if (hathi instanceof Animal) {
			System.out.println("HATHI");
		} else {
			System.out.println("!HATHI");
		}
	}
}