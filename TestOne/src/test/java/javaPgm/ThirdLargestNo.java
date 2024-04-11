package javaPgm;

public class ThirdLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57,26,77,89,77,56,105,112,14,15};
	      size = array.length;
	      System.out.println("size of array : " + size);

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	 
	      System.out.println("Second largest number is : "+array[size-2]);
	}

}
