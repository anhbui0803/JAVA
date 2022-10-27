package rectangle;

public class Rectangle {
    public double x;
    public double y;

    public Rectangle() {}

    public double perimeter() {
        return (x + y) * 2;
    }

    public double area() {
        return x * y;
    }
}
