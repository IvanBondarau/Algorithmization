package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task12 {
	
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
		
		System.out.println("Increasing order: ");
		
		for (int row = 0; row < rows; row++) {
			Arrays.sort(matrix[row]);
		}
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(matrix[row][column] + " ");
				matrix[row][column] *= -1;
			}
			System.out.println();
		}
		
		System.out.println("Descending order");
		
		for (int row = 0; row < rows; row++) {
			Arrays.sort(matrix[row]);
		}
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] *= -1; 
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
}
