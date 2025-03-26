import java.util.Scanner;

class Demo {
    double Volume;

    Demo(double S) {
        Volume = S * S * S;
    }

    Demo(double L, double B , double H) {
        Volume = L * B * H;
    }

    void displayVolume() {
        System.out.println("Volume: " + Volume);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the side of the cube: ");
        double S = s1.nextDouble();
        Demo cube = new Demo(S);
        System.out.print("Volume of cube: ");
        cube.displayVolume();

        System.out.print("Enter the length of the box: ");
        double L = s1.nextDouble();
        System.out.print("Enter the width of the box: ");
        double B = s1.nextDouble();
        System.out.print("Enter the height of the box: ");
        double H = s1.nextDouble();
        Demo box = new Demo(L, B , H);
        System.out.print("Volume of box: ");
        box.displayVolume();

        s1.close();
    }
}
