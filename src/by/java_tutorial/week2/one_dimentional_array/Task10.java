//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.Scanner;

public class Task10 {

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
		
		for (int i = 1; i < a.length; i += 2) {
			a[i] = 0;
		}
		
		for (int i = 0; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
	}

}
