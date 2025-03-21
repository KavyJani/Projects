import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int F = s1.nextInt();

        System.out.print("Enter 2nd number: ");
        int S = s1.nextInt();

        System.out.print("Enter 3rd number: ");
        int T = s1.nextInt();

        int max, mid, min;

        if (F >= S && F >= T) {
            max = F;
            if (S >= T) {
                mid = S;
                min = T;
            } else {
                mid = T;
                min = S;
            }
        } else if (S >= F && S >= T) {
            max = S;
            if (F >= T) {
                mid = F;
                min = T;
            } else {
                mid = T;
                min = F;
            }
        } else {
            max = T;
            if (F >= S) {
                mid = F;
                min = S;
            } else {
                mid = S;
                min = F;
            }
        }

        System.out.println("Numbers in decreasing order: " + max + " " + mid + " " + min);

        s1.close();
    }
}
