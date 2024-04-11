package collections;
import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating HashSet and adding elements
		java.util.HashSet<String> set = new java.util.HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi"); //set will not allow duplicates
		set.add("Ajay");
		// Traversing elements
		Iterator<String> itr = set.iterator();
//		Iterator<String> itr = set.iterator();
	
		while (itr.hasNext()) {
			System.out.println(itr.next());  
		}

	}
}

