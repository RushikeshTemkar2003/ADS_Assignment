/* Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series. 
*/
import java.util.Scanner;

public class FibonacciSeries {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the number of terms: ");
	int n = scanner.nextInt();

	if (n <= 0) {
		System.out.println("Please enter a positive integer.");
	} else {
		System.out.println("Fibonacci Series up to " + n + " terms:");
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}

    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac FibonacciSeries.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java FibonacciSeries
Enter the number of terms: 4
Fibonacci Series up to 4 terms:
0 1 1 2
*/
