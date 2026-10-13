package session12;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		double[] nums = {2.6, 7.8, 10};
		double[] refCopy = nums; // reference copy
		double[] anotherNums = new double[nums.length];
		for (int i = 0; i < nums.length; i++) {
			anotherNums[i] = nums[i];
		}
		nums = null;
		// How many arrays exist in memory? 2
		double [] arrCopy = Arrays.copyOf(anotherNums, anotherNums.length);
		
	}
}
