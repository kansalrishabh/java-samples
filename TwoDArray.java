public class TwoDArray {
	public static void main(String[] args) {
		int[][] twoD = {
			{
				1, 2,7
			},
			{
				3, 4, 5
			},
			{
				6
			}
		};
		
		int k = 0;

		for(int i : twoD[k]) {
			for(int j : twoD[k]) {
				System.out.print(j + " ");
			}
			++k;
			System.out.println();
		}
	}
} 