package by.java_tutorial.week2.decomposition;

public class Task3 {
	public static double calculateHexagonArea(double a) {
		return 6*calculateEqTriangleArea(a);
	}
	
	public static double calculateEqTriangleArea(double a) {
		return Math.sqrt(3)*a*a/4;
	}
}
