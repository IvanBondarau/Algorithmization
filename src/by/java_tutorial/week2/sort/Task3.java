package by.java_tutorial.week2.sort;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		selectionSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int maxIndex = findIndexOfMaxElement(arr, i);
			if (maxIndex != i) {
				swap(arr, i, maxIndex);
			}
		}
	}
	
	private static int findIndexOfMaxElement(int[] arr, int startsWith) {
		int resIndex = startsWith;
		for (int i = startsWith + 1; i < arr.length; i++) {
			if (arr[i] > arr[resIndex]) {
				resIndex = i;
			}
		}
		return resIndex;
	}
	
	private static void swap(int[] arr, int x, int y) {
		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
	}


}
