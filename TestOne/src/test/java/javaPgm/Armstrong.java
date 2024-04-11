package javaPgm;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, c, arm = 0;
		// Scanner s = new Scanner(System.in);
		// System.out.println("Enter any no.");
		// n=s.nextInt();
		int n = 153;
		c = n;
		while (n > 0) {
			rem = n % 10;
			arm = (rem * rem * rem) + arm;
			n = n / 10;
		}
		if (c == arm) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}

}
