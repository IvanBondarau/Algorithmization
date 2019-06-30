package by.java_tutorial.week2.decomposition;

public class Task7 {
	
	private static long factorial(int n) {
		long res = 1;
		for (int i = 2; i < n; i++) {
			res *= i;
		}
		return res;
	}
	
	public static long oddFactorialSum() {
		long res = 0;
		for (int i = 1; i < 10; i += 2) {
			res += factorial(i);
		}
		return res;
	}
}
