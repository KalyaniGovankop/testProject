package javaPgm;

public class SentenceReverseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is interview question really ?";
		String output = "", op2 = "";
		String[] array = input.split(" ");

		for (int i = array.length - 1; i >= 0; i--) {
			output = output + array[i] + " ";

		}
		System.out.println(output);

	}
}
