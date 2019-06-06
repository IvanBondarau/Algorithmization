//Даны действительные числа
//a1, a2, ... ,a2n
//Найти max(a1 + a2n, a2 + a2n-1, ...)

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Scanner;

import static java.lang.Math.max;

public class Task7 {

	@SuppressWarnings("resource")
	public static void main(String[] Sargs) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = in.nextInt();
				
		System.out.println("Enter 2*n numbers: ");
		double[] a = new double[n*2];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextDouble();
		}
		
		int l = 0; 
		int r = a.length - 1;
		double ans = Double.NEGATIVE_INFINITY;
		
		while (l < r) {
			ans = max(ans, a[l] + a[r]);
			l++;
			r--;
		}
		
		System.out.println("Ans = " + ans);

	}

}
