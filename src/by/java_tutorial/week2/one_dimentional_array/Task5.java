// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Scanner;

public class Task5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i+1) {
				System.out.println(a[i]);
			}
		}
	}

}
