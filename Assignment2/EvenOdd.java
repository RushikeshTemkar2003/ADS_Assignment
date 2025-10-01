/*Count even and odd elements in an array*/
import java.util.*;
class EvenOdd{
 static void count(int a[]){
	int e=0,o=0;
	for(int x:a){
	 if(x%2==0) e++; else o++;
	}
	System.out.println("Even: "+e+"  Odd: "+o);
}
  public static void main(String args[]){
	int arr[]={1,2,3,4,5};
	count(arr);
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac EvenOdd.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java EvenOdd
Even: 2  Odd: 3
*/
