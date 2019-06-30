package by.java_tutorial.week2.multi_dimentional_array;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int rows = 10;
		int columns = 20;
		
		int[][] matrix = new int[rows][columns];
		
		Random rand = new Random();
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				matrix[row][column] = rand.nextInt(16);
			}
		}
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		
		for (int row = 0; row < rows; row++) {
			if (count(matrix[row], 5) >= 3) {
				System.out.println(row + 1);
			}
		}
			
	}
	
	
	private static int count(int[] arr, int val) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				res++;
			}
		}
		return res;
	}
}
