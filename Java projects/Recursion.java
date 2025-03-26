import java.util.Scanner;

class Demo {
    double F(double n) {
        if (n == 0 || n == 1) 
            return 1;
        return n * F(n - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double N = s1.nextDouble();

        Demo calculator = new Demo();
        System.out.println("Factorial of " + N + " is: " + calculator.F(N));

        s1.close();
    }
}
