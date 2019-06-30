package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task13 {
	
	private static int[][] matrix = null;
	private static int rows = 0;
	private static int columns = 0;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter matrix size(rows ans columns): ");
		rows = in.nextInt();
		columns = in.nextInt();
		
		System.out.println("Enter matrix: ");
		
		matrix = new int[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = in.nextInt();
			}
		}
		
		System.out.println("Increasing order: ");
		
		transpose();
		
		for (int row = 0; row < rows; row++) {
			Arrays.sort(matrix[row]);
		}
		
		transpose();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(matrix[row][column] + " ");
				matrix[row][column] *= -1;
			}
			System.out.println();
		}
		
		System.out.println("Descending order");
		
		transpose();
		
		for (int row = 0; row < rows; row++) {
			Arrays.sort(matrix[row]);
		}
		
		transpose();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] *= -1; 
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
	
	private static void transpose() {
		int[][] resMatrix = new int[columns][rows];
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				resMatrix[column][row] = matrix[row][column];
			}
		}
		matrix = resMatrix;
		
		rows = rows + columns;
		columns = rows - columns;
		rows = rows - columns;
	}
}
