package parallelogram;
import java.lang.Math;

public class Parallelogram {
    public double x;
    public double y;
    public double h;

    public Parallelogram() {}

    public double perimeter() {
        return x * 2 + y * 2;
    }

    public double area() {
        return Math.max(x, y) * h;
    }
}