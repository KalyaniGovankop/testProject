package javaPgm;

public class TotalCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str;
		int count = 0;
//	Scanner s = new Scanner(System.in);
		// System.out.println("Enter any String");
//		str = s.nextLine();
		String str = "Kalyanig";
	//	int length = str.length();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);

	}

}
