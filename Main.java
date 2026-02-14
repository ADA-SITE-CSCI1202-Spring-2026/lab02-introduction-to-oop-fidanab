package week3.geometry;

public class Main {
public static void main(String[] args) {

    Point a = new Point(0, 0);
    Point b = new Point(4, 4);

    Segment s = new Segment(a, b);
System.out.println("Length: " + s.length());
System.out.println("Slope: " + s.getSlope());
System.out.println("Intercept: " + s.getIntercept());
Point test = new Point(2, 2);

        System.out.println("On Line? " + s.isOnLine(test));
        System.out.println("On Segment? " + s.isOnSegment(test));

        s.translate(1, 1);
        System.out.println("After translation length: " + s.length());
    
}
}
