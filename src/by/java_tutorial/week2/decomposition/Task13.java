package by.java_tutorial.week2.decomposition;

public class Task13 {
	
	public static void findTwinPrime(int n) {
		for (int i = n; i<= 2*n-2; i++) {
			if (isPrime(i) && isPrime(i+2)) {
				System.out.println(i + " " + (i+2));
			}
		}
	}
	
	private static boolean isPrime(long num) {
		if (num == 1) {
			return false;
		}
		for (long i = 2; i*i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
