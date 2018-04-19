public class ConditionalBreak {
	public static void main(String[] args) {
		outer:
		for(int i = 0; i < 10; i++) {
			inner:
			for(int j = 0; j < 5; j++) {
				if (i == 5) continue outer;
				System.out.println(i + " " + j);
			}
		}
	}
}