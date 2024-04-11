package javaPgm;

public class SwappingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5,y=1;
		int temp;
		temp = x;
		x=y;
		y=temp;
		System.out.println(" x is " + x + " and " + " y is " + y);
		
		x=x+y; //6 +
		y=x-y; //5 -
		x=x-y; //1 - 
		System.out.println(" x is " + x + " and " + " y is " + y);
	}

}
