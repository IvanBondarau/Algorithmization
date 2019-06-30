package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

public class Task6 {
	
	private static int size;
	
	private static boolean inUpperTriangle(int x, int y) {
		return y >= x && x <= (size - y - 1);
	}
	
	private static boolean inLowerTriangle(int x, int y) {
		return y <= x && x >= (size - y - 1);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		
		size = in.nextInt();

		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				
				if (inUpperTriangle(row, column) || inLowerTriangle(row, column)) {
					matrix[row][column] = 1;
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
