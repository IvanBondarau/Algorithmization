package by.java_tutorial.week2.decomposition;

public class Task6 {

	public static boolean areMutuallySimple(long a, long b, long c) {
		return gcd(a,b) == 1 && gcd(b,c) == 1 && gcd(a,c) == 1;
	}
	
	private static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
