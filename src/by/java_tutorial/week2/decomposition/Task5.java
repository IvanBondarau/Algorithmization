package by.java_tutorial.week2.decomposition;

public class Task5 {
	
	public static int findSecondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
		}
		return secondMax;
	}
}
