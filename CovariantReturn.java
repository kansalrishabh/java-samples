public class CovariantReturn {
	/**
	 * @param args array of {@link java.lang.String}, the command line argument.
	 * @deprecated this method is deprecated use xyz() instead.
	 */
	@Deprecated
	public static void main(String[] args) {
		Grain g = null;
		Mill mill = null;

		mill = new Mill();
		g = mill.process();
		System.out.println(g);

		mill = new WheatMill();
		g = mill.process();
		System.out.println(g);
	}
}