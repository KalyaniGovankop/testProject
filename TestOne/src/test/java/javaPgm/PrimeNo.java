package javaPgm;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, count = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		num = s.nextInt();

		for (i = 2; i < num; i++)
               if (num % i == 0) {
				count++;
				break;
			}

		if (count == 0)
			System.out.println("\nIt is a Prime Number.");
		else
			System.out.println("\nIt is not a Prime Number.");
	}

}
