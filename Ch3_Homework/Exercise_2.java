/*
2.Iterate over a2D array diagonally right downusing pointers. 
*/

public class Exercise_2{
    public static void main(String[] args) {
       int[][] Arr = { 
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 }, 
            };
       
       for (int i = 0; i < 7; i++) // for loop
       {
          for (int j = 0; j < 7; j++)
          {
             for (int k = 0; k < 7; k ++)
             { 
                if (j-i == k) {
                   System.out.print(Arr[i][k] + " ");
                }
 
             }
 
          }
 
          System.out.println();
       }

    }
 
}
