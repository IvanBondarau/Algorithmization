package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter matrix size(rows ans columns): ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		
		System.out.println("Enter matrix: ");
		
		double[][] matrix = new double[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = in.nextDouble();
			}
		}
		
		
		System.out.println("Enter column's nums:");
		int column1 = in.nextInt();
		int column2 = in.nextInt();
		column1--; column2--;
		
		for (int row = 0; row < rows; row++) {
			matrix[row][column1] = matrix[row][column1] + matrix[row][column2];
			matrix[row][column2] = matrix[row][column1] - matrix[row][column2];
			matrix[row][column1] = matrix[row][column1] - matrix[row][column2];
		}
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}

	}

}
