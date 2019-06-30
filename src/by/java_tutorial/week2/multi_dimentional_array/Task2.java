package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter matrix size: ");
		int size = in.nextInt();
		
		System.out.println("Enter matrix: ");
		
		int[][] matrix = new int[size][size];
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				matrix[row][column] = in.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(matrix[i][i]);
		}

	}

}
