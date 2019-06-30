package by.java_tutorial.week2.sort;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		insertionSort(a);
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
	
	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int curElement = arr[i];
			int insertionPos = binSearch(arr, 0, i, curElement);
			if (arr[insertionPos] < curElement) {
				insertionPos++;
			}
			for (int k = i - 1; k >= insertionPos; k--) {
				arr[k + 1] = arr[k];
			}
			arr[insertionPos] = curElement;
		}
	}
	
	private static int binSearch(int arr[], int l, int r, int val) {
		while (r - l >= 2) {
			int m = (l + r) / 2;
			if (arr[m] > val) {
				r = m;
			} else {
				l = m;
			}
		}
		return l;
		
	}
	

}
