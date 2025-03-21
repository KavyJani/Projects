import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        String[] words = input.split("\\s+");
        int capitalWordCount = 0;
        
        for (String word : words) {
            if (word.matches(".*[A-Z].*")) {
                capitalWordCount++;
            }
        }
        
        System.out.println("Number of words containing at least one capital letter: " + capitalWordCount);
        
        s1.close();
    }
}
