import java.util.Scanner;

class Demo { 
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Marks of 1st subject: ");
        double sub1 = s1.nextDouble();

        System.out.print("Marks of 2nd subject: ");
        double sub2 = s1.nextDouble();

        System.out.print("Marks of 3rd subject: ");
        double sub3 = s1.nextDouble();

        System.out.print("Marks of 4th subject: ");
        double sub4 = s1.nextDouble();

        System.out.print("Marks of 5th subject: ");
        double sub5 = s1.nextDouble();

        System.out.print("Marks of 6th subject: ");
        double sub6 = s1.nextDouble();

        double total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
        System.out.println("Total marks: " + total);

        double percentage = (total / 600) * 100; 
        System.out.println("Percentage: " + percentage + "%");

        s1.close();
    }
}
