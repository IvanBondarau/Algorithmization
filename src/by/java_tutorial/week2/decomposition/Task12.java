package by.java_tutorial.week2.decomposition;

public class Task12 {
	
	public static int[] getArray(int n, int k) {
		
		int numbersCounter = 0;
		
		for (int i = 0; i <= n; i++) {
			if (digitsSum(i) == k) {
				numbersCounter++;
			}
		}
		
		int res[] = new int[numbersCounter];
		int resPointer = 0;
		
		for (int i = 0; i <= n; i++) {
			if (digitsSum(i) == k) {
				res[resPointer++] = i;
			}
		}
		
		return res;
	}
	
	private static int digitsSum(long num) {
		int ans = 0;
		while (num != 0) {
			ans += num % 10;
			num /= 10;
		}
		return ans;
	} 
}
