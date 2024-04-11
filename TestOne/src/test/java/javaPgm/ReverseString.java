package javaPgm;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String = " + str.toString());

		// reverse the string
		StringBuilder reverseStr = str.reverse();

		// print string
		System.out.println("Reverse String = " + reverseStr.toString());

	}

}
