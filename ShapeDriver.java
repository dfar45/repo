package session10;

public class ShapeDriver {

	public static void main(String[] args) {
		
		int[] nums = new int[4];
		
		Shape[] shapes = new Shape[4];
		nums[1] = 67;
		nums[3] = 10;
		
		Shape s1 = new Shape();
		Shape s2 = new Shape("Square", "brown");
		Shape s3 = new Shape(s2);
		System.out.print(s2);

	}

}
