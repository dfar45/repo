package session13;

public class RaggedDemo {

	public static void main(String[] args) {
		int[][] scores = {{78, 90, 67}, {89, 76}, {100}};
		System.out.print(findSum(scores, 1)+" "+findSum(scores, 0));
	}
	public static int findSum(int[][] array, int n) {
		int sum = 0;
		for (int r = 0; r < array.length; r++) {
			if (n < array[r].length) {
				sum += array[r][n];
			}
		}
		return sum;
	}
}
