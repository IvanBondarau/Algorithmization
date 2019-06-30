package by.java_tutorial.week2.decomposition;

public class Task17 {
	
	public static void main(String[] args) {
		System.out.println(countSubtractions(15312)); 
	}
	
	public static int countSubtractions(long num) {
		int substractions = 0;
		while (num != 0) {
			num -= digitSum(num);
			substractions++;
		}
		return substractions;
	}
	
	private static int digitSum(long num) {
		int ans = 0;
		while (num != 0) {
			ans += num % 10;
			num /= 10;
		}
		return ans;
	} 
}
