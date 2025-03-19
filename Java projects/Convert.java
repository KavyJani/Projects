import java.util.Scanner;

class Exchange { 
    public static void main(String[] args) {
        double er = 85;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount in Rupees: ");
        double rupees = scanner.nextDouble();
        
        double dollar = rupees / er;
        
        System.out.println("Amount in dollars: " + dollar);
        
        scanner.close();
    }
}
