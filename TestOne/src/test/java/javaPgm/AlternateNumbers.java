package javaPgm;

public class AlternateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 12, 13, 14, 15 };

		// array length
		int n = arr.length;

		// loop through the array and increment by 2
		for (int i = 0; i < n; i = i + 2) {
			// print element Alternate numbers
			System.out.println(arr[i]);

		}

	}

}
