//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Arrays;
import java.util.Scanner;


public class Task2 {

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
		
		System.out.println("Enter Z");
		double z = in.nextDouble();
		
		int replacementsNum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				replacementsNum++;
				a[i] = z;
			}
		}
		
		System.out.println("Number of replacements: " + replacementsNum);
		System.out.println("Resulting array:\n" + Arrays.toString(a));
		
	}
}