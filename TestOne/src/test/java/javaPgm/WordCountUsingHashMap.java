package javaPgm;

import java.util.HashMap;

public class WordCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "Alice is girl and Bob is boy";
		  
			HashMap <String, Integer> WordCount = new HashMap<>();  
	 //       HashMap<String, Integer> hashMap = new HashMap<>();
	 
	        String[] words = str.split(" ");
	 
	        for (String word : words) {
	            // containsKey(key) will return a boolean value
	            // i.e. true if it contains the key and false if
	            // it doesn't.
	            if (WordCount.containsKey(word)) {
	            	WordCount.put(word, WordCount.get(word) + 1);
	            }
	            else
	            	WordCount.put(word, 1);
	        }
	 
	        System.out.println(WordCount);
	}

}
