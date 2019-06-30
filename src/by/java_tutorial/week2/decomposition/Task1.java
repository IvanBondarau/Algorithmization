package by.java_tutorial.week2.decomposition;

public class Task1 {

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

}
