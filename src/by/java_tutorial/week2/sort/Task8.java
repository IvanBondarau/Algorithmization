package by.java_tutorial.week2.sort;

import java.util.Scanner;

public class Task8 {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements in sequence: ");
		int n = in.nextInt();
				
		System.out.println("Enter array p: ");
		int[] p = new int[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = in.nextInt();
		}
		
		System.out.println("Enter array q: ");
		int q[] = new int[n];
		for (int i = 0; i < q.length; i++) {
			q[i] = in.nextInt();
		}
		
		System.out.println();
		
		int denominatorLcm = 1;
		for (int i: q) {
			denominatorLcm = lcm(denominatorLcm, i);
		}
		
		for (int i = 0; i < p.length; i++) {
			p[i] *= denominatorLcm/q[i];
		}
		
		ShellSort(p);
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i] + "/" + denominatorLcm);
		}
		

	}
	
	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	private static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}
	
	//OEIS A108870: Tokuda's good set of increments for Shell sort (first 20 coefficients).
	private static final int[] gaps = {226709866, 100759940, 44782196,   									
									   19903198, 8845866, 3931496, 1747331,   									
									   776591, 345152, 153401, 68178,   									
									   30301, 13467, 5985, 2660,   									
									   1182, 525, 233, 103,   									
									   46, 20, 9, 4, 1,};
	
	
	private static void ShellSort(int[] arr) {

		for (int gap: gaps)
		{
		    for (int i = gap; i < arr.length; i++)
		    {
		        int temp = arr[i];
		        int j;
		        for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
		        {
		            arr[j] = arr[j - gap];
		        }
		        arr[j] = temp;
		    }
		}
	}

}
