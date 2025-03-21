import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char L = s1.next().charAt(0);

        if ("AEIOUaeiou".indexOf(L) != -1) {
            System.out.println("Given letter is a vowel");
        } else if (Character.isLetter(L)) {
            System.out.println("Given letter is a consonant");
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        s1.close();
    }
}
