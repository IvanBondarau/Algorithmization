package by.java_tutorial.week2.sort;

import java.util.Scanner;

public class Task4 {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		bubbleSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nSwaps: " + swapCounter);

	}
	
	private static int swapCounter = 0;
	
	private static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}
	
	private static void swap(int[] arr, int x, int y) {
		arr[x] = arr[x] ^ arr[y];
		arr[y] = arr[x] ^ arr[y];
		arr[x] = arr[x] ^ arr[y];
		swapCounter++;
	}

}
