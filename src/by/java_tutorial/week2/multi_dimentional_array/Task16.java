package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

public class Task16 {
    
     public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        square = new int[n][n];
        
        rows = new int[n];
        columns = new int[n];
        
        permutation = new int[n*n];
        numberInPermutation = new boolean[n*n];
        
        genPermutation(0);
        
     }
     private static int n;
     
     private static int[][] square;
     private static int[] rows;
     private static int[] columns;
     
     private static int[] permutation;
     private static boolean[] numberInPermutation;
     
     private static void genPermutation(int pos) {
         if (pos == permutation.length) {
             
            for (int i = 0; i < n*n; i++) {
                
                rows[i/n] -= square[i/n][i%n];
                columns[i%n] -=  square[i/n][i%n];
                
                square[i/n][i%n] = permutation[i];
                
                rows[i/n] += square[i/n][i%n];
                columns[i%n] +=  square[i/n][i%n];
                
            }
            
            checkSquare();
            return;
         }
         
         for (int i = 0; i < n*n; i++) {
             if (!numberInPermutation[i]) {
                 numberInPermutation[i] = true;
                 permutation[pos] = i+1;
                 genPermutation(pos+1);
                 numberInPermutation[i] = false;
                 permutation[pos] = 0;
             }
         }
     }
     
     private static void checkSquare() {
        
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;
         
        for (int i = 0; i < n; i++) {
            if (rows[i] != rows[0] || columns[i] != columns[0] 
                || rows[i] != columns[i]) {
                    return;
                }
            mainDiagonal += square[i][i];
            secondaryDiagonal += square[i][n - i - 1];
        }
        
        if (mainDiagonal != secondaryDiagonal || mainDiagonal != rows[0]) {
            return;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        
        System.exit(0);
         
     }
     
     
}
