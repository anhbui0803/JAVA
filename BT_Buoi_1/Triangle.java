package triangle;
import java.lang.Math;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle() {}

    public boolean check_valid() {
        if (a + b > c && a + c > b && b + c > a) return true;
        return false;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
