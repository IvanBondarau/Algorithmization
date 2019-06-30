package by.java_tutorial.week2.decomposition;

public class Task16 {
	
	public static void main(String[] args) {
		countOddSum(2); 
	}
	
	public static void countOddSum(int n) {
		genNum(0, n);
		System.out.println(sum);
		System.out.println("Even digits " + countEvenDigits(sum));
	}
	
	private static long curNum = 0;
	private static long sum = 0;
	
	private static void genNum(int pos, int n) {
		if (pos == n) {
			sum += curNum;
			return;
		}
		
		for (int i = 1; i <= 9; i+= 2) {
			curNum = (curNum * 10) + i;
			genNum(pos + 1, n);
			curNum %= 10;
		}
	}
	
	private static int countEvenDigits(long num) {
		int res = 0;
		while (num != 0) {
			if (num % 10 % 2 == 0) {
				res++;
			}
			num /= 10;
		}
		return res;
	}
}
