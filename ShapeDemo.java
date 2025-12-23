abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        System.out.println("Area of Circle: " + s.area());

        s = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + s.area());

        s = new Triangle(5, 3);
        System.out.println("Area of Triangle: " + s.area());
    }
}
