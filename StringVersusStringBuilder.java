package session18;

public class StringVersusStringBuilder {

	public static void main(String[] args) {
		String n1 = new String("Hi");
		n1.toUpperCase();
		System.out.println(n1);
		StringBuilder n2 = new StringBuilder("Hi");
		n2.reverse();
		System.out.println(n2);
		String n3 = "This is CMSC 203 course";
		char[] arr = n3.toCharArray();
		
		

	}

}
