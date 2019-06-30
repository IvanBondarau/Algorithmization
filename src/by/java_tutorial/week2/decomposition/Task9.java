package by.java_tutorial.week2.decomposition;

import static java.lang.Math.sqrt;

public class Task9 {
	
	public static double calcArea(double x, double y, double z, double t) {
		double diagonal = sqrt(x*x + y*y);
		return (x*y/2) + calcTriangleArea(diagonal, z, t);
	}
	
	//Heron's formula for triangle
	private static double calcTriangleArea(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
