import java.text.DecimalFormat;

class Demo {
    public static void main(String[] args) {

        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

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
