package javaPgm;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java is a fun programming language";

		// split string from space
		String[] result = text.split(" ");
		System.out.println(Arrays.toString(result));

		System.out.println("Result = ");
		for (String str : result) {
			System.out.println(str + ", ");

		}

	}
}
