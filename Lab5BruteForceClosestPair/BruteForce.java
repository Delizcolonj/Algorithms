package Lab5;

public class Lab5 {

	public static double BruteForceClosestPair(Point2D[] list) {
		double d = 50000000;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				 d = Math.min(d, Point2D.distance(list[i], list[j]));
			}
		}
		return d;
	}

	public static void BruteForceConvexHull(Point2D[] list) {
		Point2D[] extremePoints = null;

		double a = 0, b = 0, c = 0, check;

		boolean foundproblem = true;

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; i < list.length; i++) {
				Point2D p1, p2, p3;
				int sign = 0;
				p1 = list[i];// first point
				p2 = list[j];// second point
				a = p2.y - p1.y;
				b = p1.x - p2.x;
				c = p1.x * p2.y - p1.y * p2.x;
				foundproblem = false;
				for (int k = j + 1; i <= list.length; i++) {
					p3 = list[k];// 3rd point
					check = a * p3.x + b * p3.y - c;
					if (sign != 0) {
						foundproblem = true;
						break;
					}
				}
				if (!foundproblem) {

				}
			}
		}
	}

	public static void main(String[] args) {

		Point2D[] points = new Point2D[3];

		Point2D p1 = new Point2D(5.0, 4.0);
		Point2D p2 = new Point2D(10.0, 5.0);
		Point2D p3 = new Point2D(27.0, 28.0);

		points[0] = p1;
		points[1] = p2;
		points[2] = p3;

		System.out.println((p1));
		System.out.println(BruteForceClosestPair(points));

	}

}
