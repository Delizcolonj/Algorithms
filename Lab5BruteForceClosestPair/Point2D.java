package lab5;

public class Point {
    public Point[] listofPoints;
    public int numberofPoints;
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static double distanceForm(Point p1, Point p2) {
        double distance;
        distance =  Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        return distance;
    }
    public void add(Point p1) { //add method to generate a list of points
         Point point = new Point(p1.x, p1.y);
         listofPoints[numberofPoints] = point;
    }
}
