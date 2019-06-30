package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

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
		
		double[] sums = new double[columns];
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				sums[column] += matrix[row][column];
			}
		}
		
		int maxSumIndex = 0;
		for (int i = 1; i < columns; i++) {
			if (sums[maxSumIndex] < sums[i]) {
				maxSumIndex = i;
			}
		}
		
		System.out.println("Sums of columns");
		System.out.println(Arrays.toString(sums));
		System.out.println("Column with max sum: " + (maxSumIndex + 1));

	}

}
