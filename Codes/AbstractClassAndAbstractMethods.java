abstract class Shape {
    abstract void calculateArea();
    abstract void displayShape();
}
class Circle extends Shape{
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    void displayShape() {
        System.out.println("This is a circle");
    }
}
class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    void displayShape() {
        System.out.println("This is a rectangle");
    }
}
public class AbstractClassAndAbstractMethods{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        c.displayShape();
        Rectangle r = new Rectangle(2,3);
        r.calculateArea();
        r.displayShape();

    }
}
