package collections;
import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedList<String> al=new java.util.LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}

}
