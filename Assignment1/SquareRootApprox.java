/*Find Square Root
Problem: Write a Java program to find the square root of a given number (using
integer approximation). 
*/
import java.util.Scanner;

public class SquareRootApprox {
  public static void main(String[] args) {
   
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a non-negative number: ");
	int number = scanner.nextInt();


	if (number < 0) {
		System.out.println("Oops! Square root of negative number isn't supported here.");
		return;
	}

	int sqrt = 0;

	for (int i = 1; i * i <= number; i++) {
		sqrt = i;
	}

	System.out.println("The integer square root of " + number + " is: " + sqrt);

	
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac SquareRootApprox.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java SquareRootApprox
Enter a non-negative number: 4
The integer square root of 4 is: 2
*/
