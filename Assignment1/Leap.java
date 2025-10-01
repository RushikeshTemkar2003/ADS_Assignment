/*Leap Year
Problem: Write a Java program to check if a given year is a leap year. */

public class Leap{
	static boolean leapYear(int n){
		if (n%4==0 && n%100!=0){
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[]args){
		int n=2024;
		System.out.println(leapYear(n));
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Leap.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Leap
true
*/
