//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

package by.java_tutorial.week2.one_dimentional_array;

import java.util.HashMap;
import java.util.Scanner;

public class Task9 {

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
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int element: a) {
			if (map.containsKey(element)) {
				map.replace(element, map.get(element)+1);
			} else {
				map.put(element, 1);
			}
		}
		
		int mostFrequent = -1;
		for (var key: map.keySet()) {
			int curMin = map.getOrDefault(mostFrequent, Integer.MIN_VALUE);
			
			if (map.get(key) > curMin || 
				(map.get(key) == curMin && key < mostFrequent)) {
				mostFrequent = key;
			}
		}
		
		System.out.println("Element = " + mostFrequent + ", frequency = " + map.get(mostFrequent));

	}

}
