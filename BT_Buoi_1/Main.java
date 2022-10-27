
import java.util.Scanner;

import rectangle.*;
import square.*;
import triangle.*;
import rhombus.*;
import parallelogram.*;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Square square = new Square();
        System.out.print("Nhap vao do dai canh hinh vuong: ");
        square.x = scanner.nextDouble();
        System.out.println("Chu vi hinh vuong: " + square.perimeter());
        System.out.println("Dien tich hinh vuong: " + square.area());

        Rectangle rectangle = new Rectangle();
        System.out.print("Nhap vao do dai 2 canh hinh chu nhat (Cach nhau boi 1 khoang trang): ");
        rectangle.x = scanner.nextDouble();
        rectangle.y = scanner.nextDouble();
        System.out.println("Chu vi hinh chu nhat: " + rectangle.perimeter());
        System.out.println("Dien tich hinh chu nhat: " + rectangle.area());

        Triangle triangle = new Triangle();
        System.out.print("Nhap vao do dai 3 canh hinh tam giac (Cach nhau boi 1 khoang trang): ");
        triangle.a = scanner.nextDouble();
        triangle.b = scanner.nextDouble();
        triangle.c = scanner.nextDouble();
        if (triangle.check_valid() == true) {
            System.out.println("Chu vi hinh tam giac: " + triangle.perimeter());
            System.out.println("Dien tich hinh tam giac: " + triangle.area());
        }
        else {
            System.out.println("Do dai 3 canh khong phu hop tao thanh hinh tam giac");
        }

        Rhombus rhombus = new Rhombus();
        System.out.print("Nhap vao do dai 2 duong cheo hinh thoi (Cach nhau boi 1 khoang trang): ");
        rhombus.x = scanner.nextDouble();
        rhombus.y = scanner.nextDouble();
        System.out.println("Chu vi hinh thoi: " + rhombus.perimeter());
        System.out.println("Dien tich hinh thoi: " + rhombus.area());

        Parallelogram parallelogram = new Parallelogram();
        System.out.print("Nhap vao do dai 2 canh hinh binh hanh (Cach nhau boi 1 khoang trang): ");
        parallelogram.x = scanner.nextDouble();
        parallelogram.y = scanner.nextDouble();
        System.out.print("Nhap vao chieu cao ung voi canh day co do dai lon hon: ");
        parallelogram.h = scanner.nextDouble();
        System.out.println("Chu vi hinh binh hanh: " + parallelogram.perimeter());
        System.out.println("Dien tich hinh binh hanh: " + parallelogram.area());
    }
}
