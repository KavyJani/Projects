interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        System.out.println("Area of Circle: " + s.area());

        s = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + s.area());
    }
}
