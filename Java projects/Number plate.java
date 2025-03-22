import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random r1 = new Random();
        StringBuilder PN = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + r1.nextInt(26));
            PN.append(letter);
        }

        for (int i = 0; i < 4; i++) {
            int digit = r1.nextInt(10);
            PN.append(digit);
        }

        System.out.println("Generated Vehicle Plate Number: " + PN);
    }
}
