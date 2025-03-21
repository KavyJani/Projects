import java.util.Scanner;
class demo { 
public static void main(String[] args)
{
Scanner s1= new Scanner(System .in)
System.out.print("Enter Amount in meters: ");
double meter= s1.nextDouble();
double feet= meter*3.28;
System.out.print("Amount in Feet :" + feet);
s1.close();
}}
