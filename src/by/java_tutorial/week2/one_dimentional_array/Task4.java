//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		double[] a = new double[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextDouble();
		}
		
		int maxIndex = 0;
		int minIndex = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[maxIndex]) {
				maxIndex = i;
			}
			if (a[i] < a[minIndex]) {
				minIndex = i;
			}
		}
		
		a[maxIndex] = a[minIndex] + a[maxIndex];
		a[minIndex] = a[maxIndex] - a[minIndex];
		a[maxIndex] = a[maxIndex] - a[minIndex];
		
		System.out.println("Resulting array: " + Arrays.toString(a));
		
	}
}
