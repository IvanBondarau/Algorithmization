package by.java_tutorial.week2.decomposition;

public class Task14 {
	
	public static void main(String[] args) {
		findArmstrongNumbers(10000000);
	}
	
	public static void findArmstrongNumbers(int k) {
		for (int i = 1; i <= k; i++) {
			if (binPow(digitsSum(i), countDigits(i)) == i) {
				System.out.println(i);
			}
		}
	} 
	
	
	private static long binPow(long a, long n) {
		if (n == 1) {
			return a;
		}
		if (n % 2 == 0) {
			return binPow(a*a, n/2);
		} else {
			return a*binPow(a,n-1);
		}
	}
	
	
	private static int digitsSum(long num) {
		int ans = 0;
		while (num != 0) {
			ans += num % 10;
			num /= 10;
		}
		return ans;
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
