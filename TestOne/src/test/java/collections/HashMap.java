package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap implements Map<String, Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a hashmap
	    java.util.HashMap<String, Integer> languages = new java.util.HashMap<>();

	    // add elements to hashmap
	    languages.put("Java", 8);
	    languages.put("JavaScript", 1);
	    languages.put("Python", 3);
	    System.out.println("HashMap: " + languages);
	    
	    //////////////////////////////////////
	    
	    // create a hashmap
	    java.util.HashMap<String, Integer> numbers = new java.util.HashMap<>();

	    System.out.println("Initial HashMap: " + numbers);
	    // put() method to add elements
	    numbers.put("One", 1);
	    numbers.put("Two", 2);
	    numbers.put("Three", 3);
	    System.out.println("HashMap after put(): " + numbers);
	    
	    ///////////////////////////////////////
	    
	    java.util.HashMap<Integer, String> languagess = new java.util.HashMap<>();
	    languagess.put(1, "Java");
	    languagess.put(2, "Python");
	    languagess.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    // get() method to get value
	    String value = languagess.get(1);
	    System.out.println("Value at index 1: " + value);
	    
	    
	       ////////////////////////////////////////////
	    
	    
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer put(String key, Integer value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends Integer> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<String, Integer>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
