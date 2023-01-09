import java.util.*;
public class Box {
    //private double maxX, maxY, minX, minY;
    private Point min, max;
    // constructor for Box that consists of a single point
    public Box(Point p) {
        min = Point.min(p,p);
        max = Point.max(p,p);
    }

    // constructor for the Box containing two initial points
    public Box(Point a, Point b) {
        min = Point.min(a,b);
        max = Point.max(a,b);
    }

    // growBy(p) expands the bounding box (if needed) to include point p
    public void growBy(Point p) {
        min = Point.min(min,p);
        max = Point.max(max,p);
    }

    // given point p in the bounding box, returns associated point in the
    // unit square (see notes); returns null if p is not inside the bounding box.
    public Point mapIntoUnitSquare(Point p) {
        if (p.getX() > max.getX() || p.getX() < min.getX() ||
        p.getY() < min.getY() || p.getY() < min.getY()) {
            return null;
        }
        return new Point((p.getX()-min.getX())/this.getWidth(), (p.getY()-min.getY())/this.getHeight());
    }

    // returns string representation like: 2.0 < x < 9.0, 3.0 < y < 7.0
    public String toString() {
        return min.getX() + " < x < " + max.getX() + ", " + min.getY() + " < y < " + max.getY();
    }

    private double getWidth() {
        return max.getX() - min.getX();
    }

    private double getHeight() {
        return max.getY() - min.getY();
    }
}
