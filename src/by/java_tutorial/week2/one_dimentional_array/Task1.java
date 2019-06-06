// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("Enter k: ");
		int k = in.nextInt();
		
		int sum = 0;
		for (int element: a) {
			if (element % k == 0) {
				sum += element;
			}
		}
		
		System.out.println("Sum = " + sum);

	}

}
