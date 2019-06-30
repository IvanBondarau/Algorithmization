package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Scanner;

import static java.lang.Math.sin;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		
		int size = in.nextInt();

		double[][] matrix = new double[size][size];
		int positiveCounter = 0;
		
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				matrix[row][column] = sin(((double)(row*row - column*column)) / (size*size));
				if (matrix[row][column] > 0) {
					positiveCounter++;
				}
			}
		}
		
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Positive: " + positiveCounter);

	}

}
