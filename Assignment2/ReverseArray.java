/*Print array elements in reverse order. */
import java.util.*;
class ReverseArray{
 static void reverse(int a[]){
	for(int i=a.length-1;i>=0;i--)
	  System.out.print(a[i]+" ");
    }
 public static void main(String args[]){
	int arr[]={1,2,3,4,5};
	reverse(arr);
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac ReverseArray.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java ReverseArray
5 4 3 2 1
*/