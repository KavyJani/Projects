import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 1; i <= input.length(); i++) {
            System.out.println(input.substring(0, i));
        }

        s1.close();
    }
}
