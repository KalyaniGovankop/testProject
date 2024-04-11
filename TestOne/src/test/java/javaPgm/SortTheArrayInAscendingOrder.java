package javaPgm;

public class SortTheArrayInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize array
		int[] arr = new int[] { 1, 2, 3456, 56, 12, 875, 9, 0, -9, -90 ,-115};
		int temp = 0;

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// Displaying elements of array after sorting
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			// System.out.println(arr[4]);

		}

	}

}
