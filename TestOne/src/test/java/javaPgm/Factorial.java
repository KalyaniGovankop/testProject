package javaPgm;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=5,fact=1;
//		Scanner s = new Scanner(System.in);
//			System.out.println("Enter any no.");
//			n = s.nextInt();

			for (i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println(fact);


	}

}
