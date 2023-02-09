/*
Write  a programto  add  two  matrices.  In  order  to  be  added,  
the  two matrices must have the same dimensions andthe same or compatible 
types of elements. 
*/


import java.util.*;

public class Exercise_5 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the size of matrix:");
      int n = input.nextInt();
      float[][] matrix_1;
      matrix_1 = new float[n][n];
      float[][] matrix_2;
      matrix_2 = new float[n][n];

      System.out.println("Please enter the first matrix:");
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            matrix_1[i][j] = input.nextFloat();
         }
      }

      System.out.println("Enter the second matrix:");

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            matrix_2[i][j] = input.nextFloat();
         }
      }
      System.out.println();

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(matrix_1[i][j] + "  ");
         }
         System.out.println();
      }
      System.out.println();
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(matrix_2[i][j] + " ");
         }
         System.out.println();
      }
      
      float[][] a = new float[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            a[i][j] = matrix_1[i][j] + matrix_2[i][j];
         }
      }
      
      System.out.print("The matrices are added as follows:");
      System.out.println();
      
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(a[i][j] + " ");
         }
         System.out.println();
      }
      input.close();
   }
}
