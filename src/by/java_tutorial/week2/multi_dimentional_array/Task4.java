package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int size = in.nextInt();

		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				
				if (row % 2 == 0) {
					matrix[row][column] = column + 1;
				} else {
					matrix[row][column] = size - column;
				}
				
				
			}
		}
		
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}

	}
	
	

}
