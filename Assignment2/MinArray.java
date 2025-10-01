/*Find the minimum element in an array. */
import java.util.*;
class MinArray{
  static int min(int a[]){
	int m=a[0];
	for(int i=1;i<a.length;i++)
	  if(a[i]<m) m=a[i];
	return m;
    }
  public static void main(String args[]){
	int arr[]={15,8,22,5,19};
	System.out.println("Minimum : "+min(arr));
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac MinArray.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java MinArray
Minimum : 5
*/