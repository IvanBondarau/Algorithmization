//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Scanner;

public class Task3 {

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
		
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		
		for (double element: a) {
			if (element > 0) {
				positive++;
			} else if (element < 0) {
				negative++;
			} else {
				zeros++;
			}
		}
		
		System.out.println(String.format("Positive: %d\nNegative: %d\nZeros: %d", positive, negative, zeros));

	}

}
