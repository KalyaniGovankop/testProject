package javaPgm;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rev;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no");
		n = s.nextInt();

		while (n > 0) {
			rev = n % 10;
			System.out.print(rev);
			n = n / 10;
		}

	}

}
