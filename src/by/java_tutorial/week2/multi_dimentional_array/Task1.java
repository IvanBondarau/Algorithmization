package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter matrix size(rows ans columns): ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		
		System.out.println("Enter matrix: ");
		
		int[][] matrix = new int[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = in.nextInt();
			}
		}

		
		for (int column = 0; column < columns; column += 2) {
			if (matrix[0][column] > matrix[rows - 1][column]) {
				System.out.println("Column " + (column + 1));
				for (int row = 0; row < rows; row++) {
					System.out.print(matrix[row][column] + " ");
				}
				System.out.println();
			}
		}

	}

}
