package by.java_tutorial.week2.decomposition;

public class Task15 {
	
	public static void main(String[] args) {
		genAllIncreasingNumbers(4);
	}
	
	public static void genAllIncreasingNumbers(int n) {
		curNum = new int[n];
		genNum(0);
	}
	
	private static int[] curNum = null;
	
	private static void genNum(int pos) {
		if (pos == curNum.length) {
			for (int i = 0; i < curNum.length; i++) {
				System.out.print(curNum[i]);
			}
			System.out.println();
			return;
		}
		
		if (pos == 0) {
			for (int i = 1; i <= 9; i++) {
				curNum[pos] = i;
				genNum(pos + 1);
			}
			
		} else {
			for (int i = curNum[pos - 1] + 1; i <= 9; i++) {
				curNum[pos] = i;
				genNum(pos + 1);
			}
		}
	}

}
