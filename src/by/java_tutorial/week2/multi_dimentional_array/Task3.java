package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

public class Task3 {

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
		
		System.out.println("Enter k, p:");
		int k = in.nextInt();
		int p = in.nextInt();
		
		System.out.println("k-th row:");
		for (int column = 0; column < size; column++) {
			System.out.print(matrix[k - 1][column] + " ");
		}
		
		System.out.println("\n\np-th column:");
		for (int row = 0; row < size; row++) {
			System.out.print(matrix[row][p - 1] + " ");
		}

	}

}
