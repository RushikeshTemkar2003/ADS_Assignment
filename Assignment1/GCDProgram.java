/* Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two 
*/
import java.util.Scanner;

public class GCDProgram {
  public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the first number: ");
	int num1 = scanner.nextInt();

	System.out.print("Enter the second number: ");
	int num2 = scanner.nextInt();

	num1 = Math.abs(num1);
	num2 = Math.abs(num2);

	int gcd = findGCD(num1, num2);

	System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);


}

    public static int findGCD(int a, int b) {
      
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac GCDProgram.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java GCDProgram
Enter the first number: 3
Enter the second number: 4
The GCD of 3 and 4 is: 1
*/