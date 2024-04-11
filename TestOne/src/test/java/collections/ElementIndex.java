package collections;

public class ElementIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
		
		list.add(000);
		 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        System.out.println(list);     //Output : [111, 222, 333, 444]
 
        //Getting element at index 3
        int g = list.get(3);
        System.out.println(g);
        System.out.println(list.get(0));
 
        System.out.println(list.get(3));    //Output : 444
 
        //Getting element at index 1
 
        System.out.println(list.get(1));    //Output : 222
        
      //Replacing the element at index 1 with '555'
        
        list.set(1, 555);
        
        System.out.println(list.get(1)); 
        
        list.remove(2);
        
        list.remove(3);
        
        System.out.println(list); 
     
        //Removing all elements of the list
        
        list.clear();
 
        System.out.println(list);    //Output : []
        
	}

}
