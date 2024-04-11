package collections;

public class HashMapKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 java.util.HashMap<Integer, String> languages = new java.util.HashMap<>();

		    languages.put(1, "Java");
		    languages.put(2, "Python");
		    languages.put(3, "JavaScript");
		    
		    System.out.println(languages.get(3));
		    System.out.println("HashMap: " + languages);

		    // return set view of keys
		    // using keySet()
		    System.out.println("Keys: " + languages.keySet());

		    // return set view of values
		    // using values()
		    System.out.println("Values: " + languages.values());

		    // return set view of key/value pairs
		    // using entrySet()
		    System.out.println("Key/Value mappings: " + languages.entrySet());
		    
		 // change element with key 2
		    languages.replace(2, "C++");
		    languages.remove(1);
		    System.out.println("HashMap using replace(): " + languages);
		    
		 // remove element associated with key 2
		    String value = languages.remove(2);
		    System.out.println("Removed value: " + value);

		    System.out.println("Updated HashMap: " + languages);
	}

}
