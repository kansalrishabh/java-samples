public class ForEach {
	public static void main(String... args) {
		int[] arr = new int[6];
		arr[0] = 10;
		arr[5] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for(int i : arr) {		// read as - for each int i in arr, do
			System.out.println(i);
		}
	}
}