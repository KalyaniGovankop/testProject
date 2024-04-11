package javaPgm;

import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str,rev = " ";
		int length;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any String");
		Str = s.nextLine();
		length=Str.length();

		for(int i=length-1;i>=0;i--) {

		rev=rev+Str.charAt(i);
		}
		System.out.println("String is " + Str + " and Reverse String is " + rev);

	}

}
