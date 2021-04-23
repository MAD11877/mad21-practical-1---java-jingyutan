import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

   Scanner in = new Scanner(System.in);
    
    int num = in.nextInt();
    int mode = 0;
    int count = 0;
    int arr[] = new int[num];

    
    for (int i = 0; i < num; i++) {
      int number = in.nextInt();
      arr[i] = number;
    }


    for (int x = 0; x < arr.length; x++){
      int tempcount = 0; // reset to 0 after each number

      for (int j = 0; j < arr.length; j++) {
          if (arr[x] == arr[j]){
            tempcount += 1;
          }
      }

      if (tempcount > count) {
        count = tempcount;
        mode = arr[x];
      }

    }

    System.out.print(mode);
   
  
    

    
    


  }
}
