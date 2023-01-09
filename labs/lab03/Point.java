import java.util.*;
public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point read(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }

    public String toString() {
        return this.x + " " + this.y;
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public static Point max(Point a, Point b) {
        double x, y;
        if(a.x >b.x) {
            x = a.x;
        } else {
            x = b.x;
        }
        if(a.y >b.y) {
            y = a.y;
        } else {
            y = b.y;
        }
        return new Point(x,y);
    }
    public static Point min(Point a, Point b) {
        double x, y;
        if(a.x < b.x) {
            x = a.x;
        } else {
            x = b.x;
        }
        if(a.y < b.y) {
            y = a.y;
        } else {
            y = b.y;
        }
        return new Point(x,y); 
    }
    public static void main(String[] args) {

    }
}
