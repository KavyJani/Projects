import java.util.Scanner;

class Demo {
    double Area(double R) {
        return Math.PI * R * R;
    }

    double Area (double L, double B) {
        return L * B;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Demo calculator = new Demo();

        System.out.print("Enter the radius of the circle: ");
        double R = s1.nextDouble();
        System.out.println("Area of Circle: " + calculator.Area(R));

        System.out.print("Enter the length of the rectangle: ");
        double L = s1.nextDouble();
        System.out.print("Enter the Breadth of the rectangle: ");
        double B = s1.nextDouble();
        System.out.println("Area of Rectangle: " + calculator.Area(L, B));

        s1.close();
    }
}
