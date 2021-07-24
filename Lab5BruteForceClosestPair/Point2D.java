package Lab5;

public class Point2D {
	public final double x;
	public final double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;

	}
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	public String toString() {
		return "(" + x + "," +  y + ")";
	}

	public static double distance(Point2D p1, Point2D p2) {
		double distance;
		distance = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
		return distance;
	}

}
