package session11;

public class ArrayDemo1 {

	public static void main(String[] args) {
		double[] nums = new double[3];
		nums[0] = 5.6;
		nums[2] = 8.2;
		for (int i = 0; i < 3; i++) {
			System.out.println(nums[i]);
		}
		for (double a : nums) {
			System.out.print(a + " ");
		}
	}
}
