class Shape {
    public void area() {
        System.out.println("displays area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(2);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.print(3.14);
    }
}
public class oops1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        Circle c = new Circle();
        c.area(10);
    }
}
