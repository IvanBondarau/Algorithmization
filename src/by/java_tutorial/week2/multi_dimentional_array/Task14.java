package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Random;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter matrix size(rows ans columns): ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		
		System.out.println("Enter matrix: ");
		
		int[][] matrix = new int[rows][columns];
		Random rand = new Random();
		
		for (int column = 0; column < columns; column++) {
			for (int i = 0; i < column + 1; i++) {
				int pos = 0;
				do {
					pos = rand.nextInt(rows);
				} 
				while(matrix[pos][column] == 1);
				
				matrix[pos][column] = 1;
			}
		}
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		

	}

}
