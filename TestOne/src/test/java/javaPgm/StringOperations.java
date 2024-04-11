package javaPgm;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create first string
	    String first = "Java ";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    
	    int length = joinedString.length();
	    System.out.println("Length: " + length);
	    
	    ///////////////////////////////
	    
	    String one = "one";
	    String two = "one";
	    
	    boolean result = one.equals(two);
	    
	    System.out.println(result);
	    
	    String name = new String("Test");
	    
	    System.out.println(name);
	    
	    ////////////////////////////////////////
	    
	    String str1 = "java is funnnnn";

	    // extract substring from index 0 to 11
	    System.out.println(str1.substring(0, 11));
	    
	    String str2 = "program";

	    //  1st character to the last character
	    System.out.println(str2.substring(0));  // program


	    // 4th character to the last character
	    System.out.println(str2.substring(3));  // gram
	    
	    ////////////////////////////////////////////////
	    
	    String text = "Java is a fun programming language";

	    // split string from space
	    String[] result1 = text.split(" ");

	    for (String str : result1) {
	      System.out.print(str + ", ");
	    }
	    
	    ////////////////////////////////////////////
	    
	    String vowels = "a::b::c::d:e";

	    // splitting the string at "::"
	    // storing the result in an array of strings
	    String[] result3 = vowels.split("::");

	    // converting array to string and printing it
	    System.out.println("result = " + Arrays.toString(result3));
	    
	    //////////////////////////////////////////////////////
	    
	    String str21 = "Learn\nJava \n\n   ";
	    String result21;

	    // replace all whitespace characters with empty string
	    result21 = str21.replaceAll("\\s", "");

	    System.out.println(result21);   // LearnJava
	}

}
