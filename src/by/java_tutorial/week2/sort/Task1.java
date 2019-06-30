package by.java_tutorial.week2.sort;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first array size: ");
		int sizeA = in.nextInt();
				
		System.out.println("Enter first array elements: ");
		double[] a = new double[sizeA];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextDouble();
		}
		
		System.out.println("Enter second array size: ");
		int sizeB = in.nextInt();
				
		System.out.println("Enter second array elements: ");
		double[] b = new double[sizeB];
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextDouble();
		}
		
		System.out.println("Enter k");
		int k = in.nextInt();
		
		for (int i = 0; i < k; i++) {
			System.out.print(a[i] + " "); 
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		for (int i = k; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
