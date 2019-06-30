package by.java_tutorial.week2.sort;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first array size: ");
		int sizeA = in.nextInt();
				
		System.out.println("Enter first array elements: ");
		double[] a = new double[sizeA + 1];
		for (int i = 0; i < sizeA; i++) {
			a[i] = in.nextDouble();
		}
		a[sizeA] = Double.POSITIVE_INFINITY;
		
		System.out.println("Enter second array size: ");
		int sizeB = in.nextInt();
				
		System.out.println("Enter second array elements: ");
		double[] b = new double[sizeB + 1];
		for (int i = 0; i < sizeB; i++) {
			b[i] = in.nextDouble();
		}
		b[sizeB] = Double.POSITIVE_INFINITY;
		
		int indexA = 0, indexB = 0;
		
		for (int i = 0; i < sizeA + sizeB; i++) {
			if (a[indexA] < b[indexB]) {
				System.out.print("a" + (indexA++ + 1) + " ");
			} else {
				System.out.print("b" + (indexB++ + 1) + " ");
			}
		}

	}

}
