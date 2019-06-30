package by.java_tutorial.week2.decomposition;

public class Task10 {
	
	public static byte[] getDigits(long num) {
		byte[] res;
		if (num == 0) {
			res = new byte[1];
			res[0] = 0;
		} else {
			res = new byte[countDigits(num)];
			int resPointer = res.length - 1;
			while (num != 0) {
				res[resPointer--] = (byte)(num % 10);
				num /= 10;
			}
		}
		return res;
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
