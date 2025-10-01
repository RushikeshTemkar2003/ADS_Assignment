/*. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong
number.*/
class Arm{
	
	public static int power(int x,int y){
		if (y ==0)
			return 1;
		if (y%2==0)
			return power (x,y/2)* power(x,y/2);
		return x *power(x, y/2)*power(x,y/2);
	}
	
	public static int order(int n){
		int t=0;
		while (n !=0){
			t++;
			n=n/10;
		}
		return t;
	}
	public static boolean armstrong(int n){
		int x = order(n);
		int temp=n, sum=0;
		
		while (temp !=0){
			int r=temp%10;
			sum+=power(r,x);
			temp=temp/10;
		}
		return sum==n;
	}
	public static void main(String[]args){
		int n=153;
		if (armstrong(n)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>javac Arm.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment1>java Arm
true
*/
