package collections;


class ArrayList {
	public static void main(String[] args) {
		java.util.List<Integer> languages = new java.util.ArrayList<Integer>();
		
		java.util.List<String> li = new java.util.ArrayList<String>();
		// create ArrayList
	//	ArrayList<String> languages = new ArrayList<>();
		languages.add(5);
		li.add("Kalyani");
		li.add("Kals");
		// add() method without the index parameter
	
		System.out.println("ArrayList: " + languages + li);
		
		for (String s : li) {
			System.out.println(s);
		}
	//	System.out.println();
	}
}
