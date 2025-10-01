/*Factorial
Problem: Write a Java program to compute the factorial of a given number. */

public class Fact{
	static int fact(int n){
		if (n==0)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[]args){
		int n=7;
		System.out.println(fact(n));
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Fact.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Fact
5040
*/
