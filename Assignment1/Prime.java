/*Prime Number
Problem: Write a Java program to check if a given number is prime. 
*/
class Prime{
	static boolean isprime(int n, int i){
		if (n<=2)
			return (n==2)? true:false;
		if (n% i==0)
			return false;
		if(i*i>n)
			return true;
		
		return isprime(n,i+1);
	}
	public static void main(String[]args){
		
		int n=11;
		if (isprime(n,2))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Prime.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Prime
true

*/
