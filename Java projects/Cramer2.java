import java.text.DecimalFormat;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = s1.nextDouble();

        System.out.print("Enter B: ");
        double b = s1.nextDouble();

        System.out.print("Enter C: ");
        double c = s1.nextDouble();

        System.out.print("Enter D: ");
        double d = s1.nextDouble();

        System.out.print("Enter E: ");
        double e = s1.nextDouble();

        System.out.print("Enter F: ");
        double f = s1.nextDouble();

        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        if (D == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            DecimalFormat df = new DecimalFormat("0.0000");

            System.out.println("Value of x: " + df.format(x));
            System.out.println("Value of y: " + df.format(y));
        }
    }
}
