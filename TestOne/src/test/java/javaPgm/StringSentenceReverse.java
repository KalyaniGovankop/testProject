package javaPgm;

public class StringSentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words =  "This is interview question".split(" ");

		String rev = "";
		for(int i = words.length - 1; i >= 0 ; i--)
		{
		   rev =rev +  words[i] + " ";
		}
		System.out.println(rev);

		// rev = "question interview is This "

		// can also use StringBuilder:
		StringBuilder revb = new StringBuilder();
		for(int i = words.length - 1; i >= 0 ; i--)
		{
		   revb.append(words[i]);
		   revb.append(" ");
		}
		
	System.out.println(revb);
		// revb.toString() = "question interview is This "
	}

}
