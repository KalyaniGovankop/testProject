package javaPgm;

public class StringReverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str1 = "Rocky";
		StringBuilder Str2;
		StringBuilder s = new StringBuilder();
		Str2 = s.append(Str1);
		Str2.reverse();
		System.out.println(Str1 + " " + Str2);

	}

}
