/*Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome. 
*/

public class Palindrom{
	static int recursiveFun(int n, int rev)
	{
		if (n<10){
			return rev *10+n;
		}else{
			int last=n%10;
			rev=rev*10+last;
			return recursiveFun(n/10,rev);
		}
	}
	public static void main(String[]args){
		int n = 12321;
		int rev = recursiveFun(n,0);
		
		System.out.println(rev);
		if(n==rev)
			System.out.println("true");
		else
			System.out.println("false");
	
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Palindrom.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Palindrom
12321
true
*/