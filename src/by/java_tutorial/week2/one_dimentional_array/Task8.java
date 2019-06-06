//Дана последовательность целых чисел
//a1, a2,...,an
//Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min(a1, a2, ... , an) 

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = in.nextInt();
				
		System.out.println("Enter array elements: ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		int minElement = min(a);
		int[] newArr = new int[a.length - count(a, minElement)];
		
		int newArrPointer = 0;
		for (int element: a) {
			if (element != minElement) {
				newArr[newArrPointer++] = element;
			}
		}
		
		System.out.println(Arrays.toString(newArr));

	}
	
	private static int min(int[] arr) {
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < res) {
				res = arr[i];
			}
		}
		return res;
	}
	
	private static int count(int[] arr, int val) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				res++;
			}
		}
		return res;
	}

}
