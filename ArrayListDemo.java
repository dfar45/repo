package session16;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		System.out.println(nums);
		nums.add(1, 64);
		System.out.println(nums);
		nums.remove((Integer)40);
		System.out.println(nums);
		nums.set(3, 45);
		System.out.print(nums);

	}

}
