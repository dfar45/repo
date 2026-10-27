package session15;

public class TwoDtoOneD {

	public static void main(String[] args) {
		int[][] nums = {{1,2,3,4}, {5,6}, {9}, {10,11,12,13}};
		for (int i : convert(nums)) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] convert (int[][] array) {
		int size = 0;
		for (int row = 0; row < array.length; row++) {
			for (int j = 0; j < array[row].length; j++) {
				size++;
			}
		}
		int[] list = new int[size];
		int index = 0;
		for (int r= 0; r < array.length; r++) {
			for (int j = 0; j < array[r].length; j++) {
				list[index] = array[r][j];
				index++;
			}
		}
		return list;
	}
}
