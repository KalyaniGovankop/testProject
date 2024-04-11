package javaPgm;

import org.testng.annotations.Test;


public class DuplicateWord {
    public static void main(String[] args) {
			// TODO Auto-generated method stub
		// Given below Input String containing duplicate words


    String input = "Implicit Wait During Implicit wait ";
    
    // Converting given  Input String to lowerCase below:
    input = input.toLowerCase();
    /* Split the given Input String into words using 
    built-in split() method below*/
    String[] words = input.split(" ");
    int length = words.length;
    // Using for loop 
    for( int i=0; i < length; i++)
    {
    //    int count = 0;
		// Set count to 1 for every iteration
  int count = 1 ;
        for(int j=i+1; j < length; j++)
        {
            if(words[i].equals(words[j]))
            {
                count++;
                /* Setting words[j]="0" to avoid 
                visited words */
            words[j] = "0";
            }
        }
        if (words[i] != "0" && count > 1)
            System.out.print( words[i] + "=" + count +" ");

    }

	}

}
