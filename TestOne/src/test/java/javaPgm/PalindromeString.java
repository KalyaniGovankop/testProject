package javaPgm;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev = "", org;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String");
		str = s.nextLine();
		org = str;
		System.out.println("Orginal string is " + org);
		int length;
		length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		  if (org.toLowerCase().equals(rev.toLowerCase())){
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");

	}

}
