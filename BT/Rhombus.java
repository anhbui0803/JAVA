package rhombus;
import java.lang.Math;

public class Rhombus {
    public double x;
    public double y;

    public Rhombus() {}

    public double perimeter() {
        return 4 * Math.sqrt(x * x / 4 + y * y / 4);
    }
    public double area() {
        return 0.5 * x * y;
    }
}
