/* Find the second largest element in the array. */
import java.util.*;
class SecondLargest{
  static int second(int a[]){
    int max=Integer.MIN_VALUE, sec=Integer.MIN_VALUE;
    for(int x:a){
      if(x>max){ sec=max; max=x; }
       else if(x>sec && x!=max) sec=x;
    }
      return sec;
    }
  public static void main(String args[]){
    int arr[]={10,20,30,40,50};
    System.out.println("Second Largest : "+second(arr));
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>javac SecondLargest.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M3_DSA\ADS_Assignment2>java SecondLargest
Second Largest : 40
*/
