//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Scanner;

public class Task6 {
	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
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
		
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(i + 1)) {
				sum += a[i];
			}
		}
		
		System.out.println("Sum = " + sum);
	}

}
