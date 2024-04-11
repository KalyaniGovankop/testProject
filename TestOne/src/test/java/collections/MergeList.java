package collections;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<Integer> l1 = new java.util.ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        java.util.ArrayList<Integer> l2 = new java.util.ArrayList<Integer>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        java.util.ArrayList<Integer> merge = new java.util.ArrayList<Integer>();
        merge.addAll(l1);
        merge.addAll(l2);
System.out.println("L1 : "+l1);
System.out.println("L2 : "+l2);
System.out.println("Merged : "+merge);
	}

}
