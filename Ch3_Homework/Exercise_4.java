/*
Write a programto  sort  a vector of  points  on  their  y-coordinates. 
Each point is a vectorof two values for x-and y-coordinates. 

*/
import java.util.Arrays;
public class Exercise_4 {
   public static void main(String[] args) 
   {
      int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 3, 1 }, { 4, 1 } };
      Arrays.sort(array, (x, y) -> Integer.compare(x[1], y[1]));
      System.out.println(Arrays.deepToString(array));
   }
   
}

