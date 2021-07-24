package lab5;

import static lab5.Point.*;

public class lab5partA {
    public static double BruteForceClosestPair(Point[] list) {
        double d = 500000;//infinity
        for(int i = 1; i < list.length -1; i++) {
            for(int j = i + 1; j < list.length; j++) {
                d = Math.min(d, distanceForm(list[i], list[j]));
            }
        }
        return d;
    }
    public static Point[] BruteForceConvexHull(Point[] list){
        Point[] extremePoints = new Point[10];
        double a = 0, b = 0, c = 0, check;
        boolean foundproblem  = true;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                Point p1, p2, p3;
                p1 = list[i];
                p2 = list[j];
                int sign = 0; // check if integer negative or positive
                a = p2.y - p1.y; //equation for the line
                b = p1.x - p2.x;
                c = p1.x * p2.y - p1.y * p2.x;
                foundproblem = false;
                for(int k = j + 1; k < list.length; k++) {
                    p3 = list[k];
                    check = a * p3.x + b * p3.y - c; // check plugs in the 3rd point and determines if check is all positive or all negative
                    if (sign != 0) {
                        if (check > 0 && sign < 0) {
                            foundproblem = true;
                            break;
                        } else if (check < 0 && sign > 0 ) {
                            foundproblem = false;
                            break;
                        }
                    } else {
                        if (check > 0) {
                            sign = 1;
                        } else if (check < 0) {
                            sign = -1;
                        }
                    }

                } if(foundproblem) {//adds the points when we know p1 and p2 are extreme values
                    extremePoints.equals(p1);
                    extremePoints.equals(p2);
                }
            }
        }
        return extremePoints;
    }
    public static void main(String[] args) {

        Point[] points = new Point[3];

        Point p1 = new Point(5.0, 4.0);
        Point p2 = new Point(10.0, 5.0);
        Point p3 = new Point(27.0, 28.0);

        points[0] = p1;
        points[1] = p2;
        points[2] = p3;

        System.out.println((p1));
        System.out.println(BruteForceClosestPair(points));

    }
}
