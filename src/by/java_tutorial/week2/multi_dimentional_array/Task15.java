package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter matrix size: ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		
		System.out.println("Enter matrix: ");
		
		int[][] matrix = new int[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = in.nextInt();
			}
		}
		
		int maxElementRow = 0;
		int maxElementColumn = 0;
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column <columns; column++) {
				if (matrix[row][column] > matrix[maxElementRow][maxElementColumn]) {
					maxElementRow = row;
					maxElementColumn = column;
				}
			}
		}
		
		int maxElement = matrix[maxElementRow][maxElementColumn];
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				if (matrix[row][column] % 2 != 0) {
					matrix[row][column] = maxElement;
				}
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
