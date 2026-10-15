package session13;

public class TwoDDemo {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][1] = 67;
		System.out.println(scores.length+" "+scores[0].length);
		for (int r = 0; r < scores.length; r++) {
			for (int j = 0; j < scores[r].length; j++) {
				scores[r][j] = 100;
			}
		}
		display(scores);
	}
	public static void display(int[][] array) {
		for (int r = 0; r < array.length; r++) {
			for (int j = 0; j < array[r].length; j++) {
				System.out.print(array[r][j]+" ");
			}
		}
	}
}
