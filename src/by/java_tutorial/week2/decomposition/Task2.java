package by.java_tutorial.week2.decomposition;

public class Task2 {

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static long gcd(long a, long b, long c, long d) {
		return gcd(gcd(a,b), gcd(c,d));
	}

}
