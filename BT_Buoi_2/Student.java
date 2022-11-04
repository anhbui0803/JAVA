
import java.util.Scanner;

public class Student {

    private String name;
    private String _class;
    private int age;
    private double math;
    private double physics;
    private double chemistry;

    public Student() {
    }

    public Student(String name, String _class, int age, double math, double physics, double chemistry) {
        // this(); // == Student()
        this.name = name;
        this._class = _class;
        this.age = age;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten SV: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap lop SV: ");
        this._class = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap diem 3 mon Toan, Ly, Hoa: ");
        this.math = Double.parseDouble(scanner.nextLine());
        this.physics = Double.parseDouble(scanner.nextLine());
        this.chemistry = Double.parseDouble(scanner.nextLine());
    }

    public void output() {
        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Lop: " + this._class);
        System.out.println("Toan: " + this.math);
        System.out.println("Ly: " + this.physics);
        System.out.println("Hoa: " + this.chemistry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    
}
