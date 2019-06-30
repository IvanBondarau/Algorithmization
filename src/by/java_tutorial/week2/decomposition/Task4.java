package by.java_tutorial.week2.decomposition;

import java.awt.Point;

public class Task4 {
	
		public static double maxDist(Point[] points) {
			int resPoint2 = 1; 
			int resPoint1 = 1; 
			for (int i = 0; i < points.length; i++) {
				for (int j = i+1; j < points.length; j++) {
					if (points[i].distance(points[j]) 
							> points[resPoint1].distance(points[resPoint2])) {
						resPoint1 = i;
						resPoint2 = j;
					}
				}
			}
			return points[resPoint1].distance(points[resPoint2]);
			
		}
}
