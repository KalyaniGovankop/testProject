package javaPgm;

public class OnlyNumbersPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Kalyani123Kals562";

		String no = str.toLowerCase();

		String no1 = no.replaceAll("[^a-z]", "");

		// only digits print – only numbers print
		// String printno = str.replaceAll("[^0-9]", "");

		System.out.println(no1);

	}

}
