package javaPgm;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstterm = 0, secondterm = 1;
		int n = 19, nextterm;
		for (int i = 1; i <= n; i++) {
			System.out.print(firstterm + " ");
			nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
		}

	}

}
