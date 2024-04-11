package collections;

public class IndexOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();

		list.add("JAVA");

		list.add("J2EE");

		list.add("JSP");

		System.out.println(list); // Output : [JAVA, J2EE, JSP, JAVA, SERVLETS, JAVA, STRUTS]

		// Getting the index of first occurrence of "JAVA"

		System.out.println(list.indexOf("JAVA")); // Output : 0

		// Getting the index of last occurrence of "JAVA"

		System.out.println(list.lastIndexOf("JSP")); // Output : 2
	}

}
