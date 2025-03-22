import java.util.Scanner;

public class StringHalf {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String i = s1.nextLine();

        int length = i.length();
        int halfIndex = length / 2;

        String secondHalf = i.substring(halfIndex);

        System.out.println("Length of the string: " + length);
        System.out.println("Second half of the string: " + secondHalf);

        s1.close();
    }
}
