package by.java_tutorial.week2.decomposition;

import java.util.Scanner;

public class Task8 {
	
	private static int getSum(int[] arr, int startPos, int endPos) 
			throws IllegalArgumentException {
		
		if (startPos < 0 || endPos >= arr.length) {
			throw new IllegalArgumentException("Invalid start position");
		} else {
			int res = 0;
			for (int i = startPos; i <= endPos; i++) {
				res += arr[i];
			}
			return res;
		}
		
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		int[] d = new int[n];
		for (int i = 0; i < d.length; i++) {
			d[i] = in.nextInt();
		}
		
		try {
			System.out.println(getSum(d, 1, 3));
			System.out.println(getSum(d, 3, 5));
			System.out.println(getSum(d, 4, 6));
		} catch (IllegalArgumentException e) {
			System.out.println("Sorry, array is too small");
		}
	}
	
}
