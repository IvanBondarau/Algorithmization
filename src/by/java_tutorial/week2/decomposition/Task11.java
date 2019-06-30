package by.java_tutorial.week2.decomposition;

public class Task11 {
	
	public static long compareDigitsNum(long a, long b) {
		return countDigits(a) > countDigits(b) ? a : b;
	}
	
	private static int countDigits(long num) {
		if (num == 0) {
			return 1;
		} else {
			int res = 0;
			while (num != 0) {
				res++;
				num /= 10;
			}
			return res;
		}
	}
}
